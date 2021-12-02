import java.io.*;
import java.util.*;
public class Proj8_2_CircleFile {
    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();
        fillArrayList(circles);
        printCircles(circles);
    }
    public static void fillArrayList(ArrayList<Circle> circles) {


        try{
            Scanner circleRadiiScanner = new Scanner(new File("circle_data.txt"));
            Circle circle;
            while (circleRadiiScanner.hasNext()) {
                double radius=circleRadiiScanner.nextDouble();
                circle = new Circle(radius);
                circles.add(circle);
            }

            circleRadiiScanner.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error processing file!");
            System.out.println(ex.getMessage());

        }
    }

    public static void printCircles(ArrayList<Circle> circles) {
        try {
            PrintWriter printWriter = new PrintWriter("circles_output.txt");
            for (Circle circle : circles) {
                printWriter.println("Radius: " + circle.getRadius());
                printWriter.println("Area: " +
                        String.format("%.3f",circle.area()));
                printWriter.println("Circumference: " + String.format("%.3f",circle.circumference()));
                printWriter.println();
            }
            printWriter.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Error processing file");
            System.out.println(ex.getMessage());

        }
    }
}
