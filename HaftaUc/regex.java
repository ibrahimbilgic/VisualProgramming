package HaftaUc;
public class regex {
    public static void main(String[] args) {
        String s = "in 1991 Oak released\tin 1996 it is renamed as java, Java JDK 1.0 released in 1996";
        System.out.println(s);
        System.out.println(s.replaceAll("^in", "at")); // en baştaki in'i at ile değiştir 
        System.out.println(s.replaceAll("1996$", "X"));// stringin en sonundaki 1996yı X ile değiştir.
        System.out.println(s.replaceAll("[Jj]ava", "X")); // hem j hem J ile başlayan javaları x ile değiştir.
        System.out.println(s.replaceAll("[0-9]", "X")); //tüm digitler x ile değiştir. 
        System.out.println(s.replaceAll("\\d", "X")); //tüm digitler x ile değiştir. 

        String[] parts = s.split("\\s"); // white space karakterlere göre böl
        for(String part:parts)
            System.out.println(part);
    }
}
