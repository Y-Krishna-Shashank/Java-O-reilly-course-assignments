public class Circle {
    double radius;
    Circle()
    {
        radius=1;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double circumference(){
        return 2*Math.PI*radius;
    }
    public double area(){
        return Math.PI*radius*radius;
    }
}
