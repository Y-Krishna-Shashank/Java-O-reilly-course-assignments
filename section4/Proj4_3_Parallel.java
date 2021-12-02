import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        String name;
        int age;
        ArrayList<Integer> ageList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.printf("Enter name of the person %d:\t",i+1);
            name=scan.nextLine();
            nameList.add(name);
            System.out.println();
            System.out.printf("Enter age of the person %d:\t",i+1);
            age=scan.nextInt();
            scan.nextLine();
            ageList.add(age);
        }

        for(int i=0;i<5;i++)
        {
            name=nameList.get(i);
            age=ageList.get(i);
            System.out.println(name+" is "+age+" years old");
        }
    }
}
