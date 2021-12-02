import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class TwiceData {
    public static void main(String[] args) {
        try {
            Scanner numScanner = new Scanner(new File("nums.txt"));
            PrintWriter printWriter = new PrintWriter(new File("twice_nums.txt"));

            while (numScanner.hasNext()) {
                int num = numScanner.nextInt();
                printWriter.println(num*2);
            }
            printWriter.close();
            numScanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Error processing file");
            System.out.println(exception.getMessage());
        }
    }
}
