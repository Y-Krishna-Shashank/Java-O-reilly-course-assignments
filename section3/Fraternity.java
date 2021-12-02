import java.util.Arrays;
import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char gender;
        int age;
        System.out.println("Enter your age and gender");
        age=scan.nextInt();
        gender=scan.next().charAt(0);
        if(age>=19&&gender=='M')
        {
            System.out.println("You can join the fraternity");

        }
        else
            System.out.println("You are not eligible to join the fraternity");


    }
}
