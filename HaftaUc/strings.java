package HaftaUc;
public class strings {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "ad";

        System.out.println(s1.compareTo(s2));
        

        String s = "Erciyes Üniversitesi";
        System.out.println(s.substring(10,12));

        System.out.println(s.indexOf('e'));
        System.out.println(s.indexOf('e',10));
        
        System.out.println(s.lastIndexOf('e',15));

        System.out.println(s.indexOf("es"));
    }
}
