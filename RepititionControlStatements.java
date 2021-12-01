import java.util.Scanner;

public class RepititionControlStatements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        int count2 = 0;
        do {
            System.out.println(count2);
            count2++;
        } while (count2 < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Enter a non-negative integer");
        System.out.println("Or enter negative to exit");
        int input = keyboard.nextInt();
        while (input >= 0) {
            System.out.println(input);
            System.out.println("Enter a non-negative integer");
            System.out.println("Or enter negative to exit");
            input = keyboard.nextInt();
        }
    }
}
