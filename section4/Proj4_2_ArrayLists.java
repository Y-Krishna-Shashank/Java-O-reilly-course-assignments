import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        double num;
        System.out.println("Enter real numbers greater than or equal to 0");
        while(true)
        {
            num=scan.nextDouble();
            if(num<0) {
                System.out.println("You have entered a number less than 0 exiting");

                break;
            }
                else
                    list.add(num);
            System.out.println("Enter real numbers greater than or equal to 0");

        }
        System.out.println("Numbers in reverse order");
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.println(list.get(i));
        }
    }
}
/*
* for(int i=1;i<n;i++)
* {
*   int key=arr[i];
*   int j=i-1;
*   while(j>=0&&arr[j]>key)
*   {
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=key;
  }
* */