package HaftaUc;
public class stringImmutable {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "Java";

        //equals içeriğin özdeşliğini kontrol eder..
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3)); 

        //farklı iki nesnelere gösterme durumuna göre burası false true döndürür..
        System.out.println(s1 == s2);
        System.out.println(s1 == s3); 

        
    }
}
