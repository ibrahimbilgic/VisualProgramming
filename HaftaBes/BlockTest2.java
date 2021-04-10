package HaftaBes;

public class BlockTest2 {
    static{
        System.out.println("Inside Static Block");// Yalnızca 1 kez çalışacak
    }
    {
        System.out.println("Inside Instance Block");
    }
    public BlockTest2(){
        System.out.println("Inside Constructor");
    }
    public static void main(String[] args) {
        BlockTest2 test1 = new BlockTest2();
        BlockTest2 test2 = new BlockTest2();
    }
}
