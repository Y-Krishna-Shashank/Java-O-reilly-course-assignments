import java.io.*;
import java.util.*;
public class Proj8_1_RectangleFile {
    public static void main(String[] args) {
        ArrayList<Rectangle> rectangleList;
        rectangleList = new ArrayList<>();
        fillArrayList(rectangleList);
        printRectangles(rectangleList);
    }
    public static void fillArrayList(ArrayList<Rectangle> rectangleList)
    {
        try {
            Scanner rectangleScanner = new Scanner(new File("rectangle_data.txt"));
            Rectangle rectangle;
            double length;
            double width;
            while (rectangleScanner.hasNext()) {
                length=rectangleScanner.nextDouble();
                width=rectangleScanner.nextDouble();
                rectangle = new Rectangle(length, width);
                rectangleList.add(rectangle);
            }
            rectangleScanner.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Error processing file");

            System.out.println(exception.getMessage());
        }
    }
    public static void printRectangles(ArrayList<Rectangle> rectangleList){

        for (Rectangle rectangle : rectangleList) {
            System.out.println("Length: " + rectangle.getLength());
            System.out.println("Width: " + rectangle.getWidth());
            System.out.println("Area: " + rectangle.area());
            System.out.println("Perimeter: "+rectangle.perimeter());
            System.out.println();
        }
    }
}
