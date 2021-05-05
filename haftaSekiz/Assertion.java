public class Assertion {
    public static void main(String[] args) {
        double x = 20;
        assert x>20 : "x "+ x;
        double y = Math.sqrt(x);
        System.out.println(y);
        // geliştirme sürecinde kontroller assertion için kullanırız
    }
}
