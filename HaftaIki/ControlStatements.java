package HaftaIki;

public class ControlStatements {
    public static void main(String[] args) {
        //if ifadesini oldukça kısa yazabiliriz..
        int temp = 24;
        String weather = (temp>23) ? "hot" : "cold";

        int number = 5;
        boolean even = number % 2 == 0;//number değeri çiftse true değilse false değeri atanır
        

        //Nested if -else;  if, else if, else if, else....
        // Dangling else problemi --> else kendine en yakın if'e aittir..

        //Short - Circuit Evaluation --> ilk operand sonucu garantiliyorsa ikinci operanda bakılmaz
        // if((kids != 0) && ((pieces / kids) >= 2))
        //      sysout("Each kid may have two pieces");

        
    }

}
