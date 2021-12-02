import java.util.Random;
public class FunWith2DArrays {
    public static void main(String[] args) {
        int[][] twoDArr = new int[4][3];
        fill2DArray(twoDArr);
        print2DArray(twoDArr);

        System.out.println("After doubling value of every element in the array");
        twice2DArray(twoDArr);
        print2DArray(twoDArr);
    }

    public static void fill2DArray(int[][] twoDArr) {
        Random random = new Random();
        for(int i=0;i<twoDArr.length;i++)
        {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j]=random.nextInt(100);//0...99
            }
        }
    }

    public static void print2DArray(int[][] twoDArr) {
        for(int[] arr: twoDArr)
        {
            System.out.print("| ");
            for(int num: arr)
                System.out.print(num+" ");
            System.out.print(" |");

            System.out.println();

        }

    }
    public static void twice2DArray(int[][] twoDArr)
    {
        for(int[] arr: twoDArr)
        {
            for(int i=0;i<arr.length;i++)
            {
                arr[i]*=2;
            }
        }
    }
}
