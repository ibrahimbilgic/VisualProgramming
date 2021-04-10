package HaftaDort;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] list = {1,2,3,4};
        //System.out.println(Arrays.toString(list));

        int[] source = {1,2,3,5};
        int[] target = new int[source.length];
        //Copy Array 1..
        System.out.println("before: "+Arrays.toString(target));
        System.arraycopy(source, 0, target, 0  , source.length);
        System.out.println("After: "+Arrays.toString(target));

        //Copy Array 2
        int[] target2 = Arrays.copyOf(source, source.length);
        int[] target3 = Arrays.copyOfRange(source, 0, source.length);

        System.out.println("for target2 = "+ Arrays.toString(target2));
        System.out.println("for target3 = "+ Arrays.toString(target3));

        int[] target4 = source.clone();
        System.out.println("with clone func -> "+Arrays.toString(target4));

    }
}
