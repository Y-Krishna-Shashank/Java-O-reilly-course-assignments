import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] arr =new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array values: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter "+(i+1)+" value: ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("array elements after multiplying by 2");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]*2+"\t");
        }
    }
}
