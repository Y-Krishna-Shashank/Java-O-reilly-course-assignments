import java.util.Random;
import java.util.Scanner;

public class Proj3_3_GuessTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int numberOfGuesses = 0;
        System.out.println("Please enter a number between 1 and 100: ");
        while (true) {

            int input = scan.nextInt();
            numberOfGuesses++;
            if (input < randomNumber) {
                System.out.println("Your guess was too low, try again: ");

            } else if (input > randomNumber) {
                System.out.println("Your guess was too high, try again: ");


            } else if (input == randomNumber) {
                System.out.println("Congratulations! You guessed the number in " + numberOfGuesses + " guesses! Thanks for playing!");
                break;
            } else if (input < 0 || input > 100) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100, inclusive!");

            }
        }
        System.out.println("The random number was " + randomNumber);

    }
}
