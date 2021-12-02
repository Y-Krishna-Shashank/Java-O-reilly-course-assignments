public class StringMethods1 {
    public static void main(String[] args) {
        String name="Zemoso labs";
        String name2="Zemoso labs";
        String name3 = "Rob perceival";
        String myName = "Krishna Shashank";
        for(int i=0;i<name.length();i++)
        {
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();
        if (name.equals(name2)) {
            System.out.println("names are equal");

        }
        else
            System.out.println("Names aren't equal");
        if (name.compareTo(name3) > 0) {
            System.out.println("name>name3");

        }
        else{
            System.out.println("name <= name3");

        }
        if (myName.compareTo(name3) < 0) {
            System.out.println("My name is greater than Rob perceival");

        } else if (myName.compareTo(name3) == 0) {
            System.out.println("My name is equal to Rob perceiveal");


        }
        else
            System.out.println("My name is equal to Rob perceival");
    }
}
