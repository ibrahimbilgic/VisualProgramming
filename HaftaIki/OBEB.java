package HaftaIki;

import java.util.Scanner;

public class OBEB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi girin: ");
        int num1 = scan.nextInt();
        System.out.println("Lütfen bir sayi girin: ");
        int num2 = scan.nextInt();
       
        int gcd = 1; // greatest common divisor
        int div = 2; // possible gcd 
        while(div <= num1 && div <= num2){
            if(num1 % div == 0 && num2 % div == 0){
                gcd = div;
            }
            div++;
        }
    System.out.println(gcd);
}
}
