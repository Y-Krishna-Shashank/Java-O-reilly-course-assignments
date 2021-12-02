import java.util.Scanner;

public class Proj3_2_DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;
        System.out.println("Enter a number: ");
        number=scanner.nextInt();

        if (number % 3 == 0) {
            System.out.println(number+" is divisible by 3");
        }
        else
            System.out.println(number+ " is not divisible by 3");




    }
}
