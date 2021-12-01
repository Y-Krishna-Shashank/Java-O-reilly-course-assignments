import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName;
        String firstName, lastName;
        System.out.println("Enter your first name followed by last name");
        fullName=scan.nextLine();
        int lastSpace = fullName.lastIndexOf(" ");
        lastName = fullName.substring(lastSpace + 1);
        firstName=fullName.substring(0,lastSpace);
        System.out.println("First name: "+firstName.toUpperCase());
        System.out.println("Last name: "+lastName.toLowerCase());

    }
}
