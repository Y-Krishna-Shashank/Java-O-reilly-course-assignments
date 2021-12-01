import java.util.Scanner;

public class GradeFun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char grade;
        System.out.println("Please enter a grade: ");
        grade=scan.next().charAt(0);

        switch(grade) {
            case 'A':
            case 'a':
                System.out.println("Great job!");
                break;
            case 'B':
            case 'b':
                System.out.println("Good job.");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better");
                break;
            case 'D':
            case 'd':
                System.out.println("You are getting pretty close to failing");
                break;
            case 'F':
            case 'f':
                System.out.println("You failed the course!");
                System.out.println("Try your best next time");
                break;
            default:
                System.out.println("You have entered an invalid grade");

        }
    }

}
