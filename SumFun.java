import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sum=0;
        System.out.println("Enter a non-negative integer to add to sum");
        System.out.println("Or enter a negative integer to exit");
        int number=scan.nextInt();


        while(number>=0)
        {
            sum+=number;
            System.out.println("Enter a non-negative integer ");
            System.out.println("Or enter a negative integer to exit");
            number=scan.nextInt();
        }
        System.out.println("Sum is "+sum);
    }
}
