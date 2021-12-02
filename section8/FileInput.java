import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileInput {
    public static void main(String[] args) {
        Scanner fileScanner;
        try{
            fileScanner = new Scanner(new File("input.txt"));
            int input,sum=0;
            while(fileScanner.hasNext()){
                input=fileScanner.nextInt();
                sum+=input;
            }
            System.out.println("Sum is: "+sum);
            fileScanner.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Can't find file!");
            System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Error reading input! Integer not found");
            System.out.println(ex.getMessage());
        }
    }
}
