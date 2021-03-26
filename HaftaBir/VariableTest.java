package ilkHafta;

import java.math.BigDecimal;

class VariableTest {
    public static void main(String[] args) {
        long l = 12381972319283123L; //L koymak unutulmamalı
        float b = 23.33f; //suffix f

        double massOfEarth = 5.97E12; //E = 10^

        double a = 0.02;
        double c = 0.03;
        System.out.print(c-a); //floating point işlemleri

        BigDecimal d = new BigDecimal("0.02");
        BigDecimal f = new BigDecimal("0.03");
        
        System.out.println("\n"+f.subtract(d));

        // b karakterinin oluşturulması
        char x = 'b'; // b

        char y = 98; // b

        y+=2; // d 

    }
}
