import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {

        String adjective1, adjective2, adjective3;
        String girlsName, boysName, mansName;
        String place, hobby, clothing;
        String occupation1, occupation2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter adjective1: \t");
        adjective1 = keyboard.nextLine();
        System.out.print("Enter another adjective: \t");
        adjective2 = keyboard.nextLine();
        System.out.print("Enter another adjective: \t");
        adjective3 = keyboard.nextLine();

        System.out.print("Enter girl's name: \t");
        girlsName = keyboard.nextLine();
        System.out.print("Enter boy's name: \t");
        boysName = keyboard.nextLine();
        System.out.print("Enter man's name: \t");
        mansName = keyboard.nextLine();

        System.out.print("Enter name of a place: \t");
        place = keyboard.nextLine();
        System.out.print("Enter hobby: \t");
        hobby = keyboard.nextLine();
        System.out.print("Enter the name clothing: \t");
        clothing = keyboard.nextLine();

        System.out.print("Enter occupation: \t");
        occupation1 = keyboard.nextLine();

        System.out.print("Enter another occupation: \t");
        occupation2 = keyboard.nextLine();
        System.out.print("There once was a " + adjective1 + " girl named " + girlsName + ", who was a " + adjective2 + " " + occupation1 +
                " in the Kingdom of " + place + ".\nShe loved to wear " + clothing + " and to " + hobby + ". She wanted to marry the " + adjective3 +
                " " + occupation2 + " named " + boysName + " but her father, King " + mansName + " forbid her from seeing him.");

    }
}
