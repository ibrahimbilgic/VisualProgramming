import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: sourceFile targetFile oldString newString");
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        if(inputs.length != 4){
            System.out.println("Enter: sourceFile targetFile oldString newString");
            System.exit(1);
        }
        try {
            replaceText(inputs);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void replaceText(String[] inpuStrings) throws FileNotFoundException{
        File sourceFile = new File(inputs[0]);
        File targetFile = new File(inputs[1]);
        if(!sourceFile.exists()){
            System.out.println("Source does not exist");
        }
        if(targetFile.exists()){
            System.out.println("Target exists");
            targetFile.delete();
        }
        Scanner scanner = new Scanner(sourceFile);
        PrintWriter writer = new PrintWriter(targetFile);
        String line,newLine;
        while(scanner.hasNext()){
            line=scanner.nextLine();
            newLine = line.replaceAll(inputs[2],inputs[3]);
            writer.println(newLine);
        }
        scanner.close();
        writer.close();
    } 
}
