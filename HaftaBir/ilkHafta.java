package ilkHafta;

public class ilkHafta {
    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        System.out.println(a);
        int b = a+1; //max değerden bir sonrası minimum değer
        System.out.print(b);

        int c = Math.addExact(a, 1);
        System.out.print(c);//exection verir

        //literal
        int x = 11; // decimal
        int y = 011; // octal
        int z = 0xA1; //Hexadecimal
        int t = 0b0000_1011; //binary

        int w = 1_000_000; //1000000 yazma için kullanılabilir..
        
    }
}
