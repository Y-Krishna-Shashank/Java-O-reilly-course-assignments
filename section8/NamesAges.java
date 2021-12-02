import java.io.*;
import java.util.*;

public class NamesAges {
    public static void main(String[] args) {


        PrintWriter pw;

        try {
            Scanner nameScanner = new Scanner(new File("student_names.txt"));

            Scanner ageScanner = new Scanner(new File("student_ages.txt"));
            PrintWriter printWriter = new PrintWriter("names_ages.txt");
            String name;
            int age;
            while (nameScanner.hasNext()) {
                name = nameScanner.nextLine();
                age = ageScanner.nextInt();

                printWriter.println(name + " is " + age + " years old.");
            }
            nameScanner.close();
            ageScanner.close();
            printWriter.close();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
