public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;

        System.out.println("result is " + result);
        System.out.println("difference is " + difference);
        System.out.println("product is " + product);
        System.out.println("remainder is " + remainder);
        System.out.println("quotient is "+ quotient);
        result+=20;
        System.out.println("result is now "+result);
        //unary operators

        result++;
        System.out.println("result++ "+result);
        result--;
        System.out.println("result-- "+result);
        product*=2;
        System.out.println("product is now "+product);
    }
}
