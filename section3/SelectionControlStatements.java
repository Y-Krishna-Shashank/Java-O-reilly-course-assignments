import java.util.Scanner;
public class SelectionControlStatements {
    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter your age");
        age=scan.nextInt();

        if(age>=18)
        {
            System.out.println("You are eligible to vote.");
        }
        else if(age>=16)
        {
            System.out.println("Atleast you can drive a two wheeler without gears");
        }
        else
        {
            System.out.println("You cannot vote yet. ");

        }
    }
}
