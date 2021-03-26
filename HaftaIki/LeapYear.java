package HaftaIki;

import java.util.Scanner;

public class LeapYear {

    // Kullanıcıdan verilen değere bakıp o yılın artık olup olmadığı kontrol edilsin
    
    /* A year is a leap year if it is divisible by 4 but not by 100
    or iti is divisible by 400
    1993 is not a leap year 
    2004 is a leap year 
    2000 is a leap year
    1900 is not a leap year
    */ 
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int year = tara.nextInt();

        if((year%4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("İt is a leap year");
        }
        else{
            System.out.println("it is not a leap year");
        }
        
    }
}
