package HaftaBes;

public class BlockTest {
    private static double rootOf2;
    private double rootOf3;

    static{
        rootOf2 = Math.sqrt(2);//static block
    }
    {
        rootOf3 = Math.sqrt(3);//instance block
    }
    public static void main(String[] args) {
        System.out.println(rootOf2);
        //System.out.println(rootOf3); Çıktı alamayız 
    }
}
