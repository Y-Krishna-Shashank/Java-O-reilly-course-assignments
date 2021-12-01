public class CircleDemo {
    public static void main(String[] args) {
        Circle unitCircle = new Circle();
        Circle circle_one = new Circle(5);
        printCircleData(unitCircle);
        System.out.println();
        printCircleData(circle_one);
    }

    public static void printCircleData(Circle circle) {
        System.out.println("Radius = " + circle.getRadius());
        System.out.println("Circumference = " + String.format("%.3f",circle.circumference()));
        System.out.println("Area = "+String.format("%.3f",circle.area()));
    }
}
