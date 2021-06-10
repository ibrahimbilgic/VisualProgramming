import java.util.ArrayList;
import java.util.Collection;
import java.util.EmptyStackException;

public class GenericStack<E> {
    private ArrayList<E> list = new ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public void push(E o) { 
        list.add(o);
    }

    public E pop() { 
        if(getSize() == 0)
            throw new EmptyStackException();
        E result = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return result;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public String toString() {
        return "stack: " + list.toString();
    }

    public void pushAll(Iterable<? extends E> src) {
        for (E e : src)
            push(e);
    }


    public void popAll(Collection<? super E> dst) {
        while (!isEmpty())
            dst.add(pop());
    }

    public static void main(String[] args) {
        GenericStack<Number> stack = new GenericStack<>();
        stack.push(1);
        stack.push(2);

        ArrayList<Integer> ints = new ArrayList<>();
        ints.add(-1);
        ints.add(-2);
        stack.pushAll(ints);

        ArrayList<Object> objects = new ArrayList<>();
        stack.popAll(objects);
        System.out.println(objects);
    }
}