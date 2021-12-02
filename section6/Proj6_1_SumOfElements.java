import java.util.ArrayList;
import java.util.*;
public class Proj6_1_SumOfElements {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random= new Random();
        int n=random.nextInt(15)+1;
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(1000));
        }
        int result=sumElements(list);
        System.out.println("sum is "+result);


    }

    public static int sumElements(ArrayList<Integer> list)
    {
        int sum=0;
        for (int element : list) {
            sum+=element;
        }
        return sum;
    }
}
