import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age;
        String city;
        double number;
        System.out.println("What is your name? ");
        name=keyboard.nextLine();

        System.out.println("What is your age?");
        age=keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("What city do you live in? ");
        city=keyboard.nextLine();
        System.out.println("Hello, "+name);
        System.out.println("age is "+age);
        System.out.println("city is "+city);

        System.out.println("Enter a real number: ");
        number = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("You have entered "+number);
        System.out.println("Twice your number is "+number*2);
    }
}
