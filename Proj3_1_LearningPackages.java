import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which package do you want? 1, 2 or 3");
        int choice = scanner.nextInt();
        int total = 0;
        int courses = 0;
        System.out.println("How many courses did you enroll in? ");
        int packageLimit=0;
        int additionalPackageCost=0;
        courses = scanner.nextInt();
        switch (choice) {

            case 1:
                total = 10;
                if (courses > 2) {
                    packageLimit=2;
                    additionalPackageCost=6;
                    //total+=(courses - packageLimit)*additionalCost;
                }
                break;
            case 2:
                total = 12;
                if (courses > 4) {
                    packageLimit=4;
                    additionalPackageCost=6;
                }
                break;
            case 3:
                total = 15;
                if (courses > 6) {
                    packageLimit=6;
                    additionalPackageCost=3;
                }
                break;
            default:
                System.out.println("Wrong package number entered");
        }
        total+=(courses - packageLimit)*additionalPackageCost;
        System.out.println("The total cost is $" + total);
    }
}
