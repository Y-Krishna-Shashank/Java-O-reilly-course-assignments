import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        double number1,number2,number3;
        double result;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        number1=scan.nextDouble();
        number2=scan.nextDouble();
        number3=scan.nextDouble();
        scan.nextLine();
        result=(number1+number2+number3)/3;
        System.out.println("Result: "+result);
    }
}
