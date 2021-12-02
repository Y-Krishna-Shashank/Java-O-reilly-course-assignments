import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("Krishna");
        namesList.add("Shashank");
        namesList.add("Varun");
        namesList.add("Divya");
        namesList.add("Rishika");

//        for(int i=0;i<namesList.size();i++)
//        {
//            System.out.println(namesList.get(i));
//        }

        for(String name: namesList)
            System.out.println(name);
    }
}
