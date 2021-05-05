public class TryCatch {
    public static void main(String[] args) {
        try{
            double a = 2/0;
            System.out.println(a);
        }
        catch(ArithmeticException ex){
            System.out.println("aritmetic exception");
        }
        catch(Exception ex){
            System.out.println("Exception");
        }
        finally{
            System.out.println("finally");
        }
    }
}
