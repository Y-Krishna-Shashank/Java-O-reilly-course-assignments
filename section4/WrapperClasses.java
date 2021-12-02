import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        arrayList.add(new Integer(45));
//        arrayList.add(new Integer(49));
//
        arrayList.add(13);
        arrayList.add(15);
        for(Integer element: arrayList)
        {
            System.out.println(element);
        }

        String numberInString= "45";
        int numericValue=Integer.parseInt(numberInString);
        System.out.println(numericValue);

        String piInString = "3.14159";
        double pi= Double.parseDouble(piInString);
        System.out.println("Value of pi is: "+pi);
    }
}
