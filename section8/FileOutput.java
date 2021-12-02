import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class FileOutput {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("input.txt");

//            pw.println("Hello world");
//            pw.println("writing to files using Java I/O");
            pw.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Could not write to the file!");
        }
    }
}
