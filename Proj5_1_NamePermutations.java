import java.util.ArrayList;
import java.util.Scanner;
public class Proj5_1_NamePermutations {
    public static void main(String[] args) {
        ArrayList<String> firstNameList= new ArrayList<>();
        ArrayList<String> lastNameList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String fullName;
        String firstName, lastName;
        for(int i=0;i<5;i++) {
            System.out.println("Enter your first name followed by last name");
            fullName = scan.nextLine();
            int lastSpace = fullName.lastIndexOf(" ");
            lastName = fullName.substring(lastSpace + 1);
            firstName = fullName.substring(0, lastSpace);
            firstNameList.add(firstName);
            lastNameList.add(lastName);

        }
        for (int i = 0; i < 5; i++) {
            firstName=firstNameList.get(i);

            for(int j=0;j<5;j++)
            {
                lastName=lastNameList.get(j);
                System.out.println(firstName+" "+lastName);


            }
        }

    }
}
