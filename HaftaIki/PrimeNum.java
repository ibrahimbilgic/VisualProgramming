package HaftaIki;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int num = tara.nextInt();
        boolean isTrue;
        int count = 0;
        while(count < num){
            isTrue = true;

            for(int i =2; i<= num/2;i++){
                if(num % i == 0){
                    isTrue = false;
                    break;
                }

            }
            if(isTrue && num != 1){
                System.out.println(num);
            }
            num--;
        }
    }
}
