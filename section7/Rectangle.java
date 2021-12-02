public class Rectangle {
    private double length;
    private double width;
    private static int numRectangles;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        numRectangles++;
    }

    public double getLength() {
        return length;

    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public static int getNumRectangles() {
        return numRectangles;
    }

    public double area(){
        return this.length*this.width;
    }

    public double perimeter(){

        return 2 * (this.length + this.width);
    }



}
