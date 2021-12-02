public class MethodsDemo {
    public static void main(String[] args) {
    printHello();
        printNumber(21);
        int result= giveMe10();
        System.out.println("result: " + result);
        result=addThese(3,5);
        System.out.println("result: " + result);
        double squaredResult=squaredDouble(3.6);
        System.out.println("Squared value is: "+squaredResult);

    }
    public static double squaredDouble(double num)
    {
        return num*num;
    }

    public static void printHello() {
        System.out.println("Hello world");
    }

    public static void printNumber(int num) {
        System.out.println("The number is " + num);
    }

    public static int giveMe10() {
        return 10;
    }

    public static int addThese(int num1, int num2) {
        return num1+num2;
    }
}
