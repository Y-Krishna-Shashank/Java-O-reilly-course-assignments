import java.io.*;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(){
            {
                add("Krishna");
                add("Shashank");
                add("Varun");
                add("Kumar");
                add("Divya");
            }
        };
        try {
            PrintWriter printWriter = new PrintWriter("names.txt");
            for(String name: names)
            {
                System.out.println(name);
                printWriter.println(name);
            }
            printWriter.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("Error writing to a file");
            System.out.println(ex.getMessage());
        }
    }
}
