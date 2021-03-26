package HaftaUc;
import java.util.Scanner;

public class Ispalindrome {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = scanner.nextLine();
        if(isPalindromeText(text)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("is not a palindrome");
        }

    }
    public static boolean isPalindromeText(String text){
        String filteredText = filterText(text);
        String reversedText = reverseText(filteredText);
        return filteredText.equalsIgnoreCase(reversedText);
        
    }
    public static String reverseText(String text){
        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();
        return reversedText.toString();
    }
    public static String filterText(String text){
        StringBuilder filteredText = new StringBuilder(text.length());
        for(int i = 0; i<text.length();i++){
            if(Character.isLetterOrDigit(text.charAt(i))){
                filteredText.append(text.charAt(i));
            }
        }
        return filteredText.toString();
    }
}
