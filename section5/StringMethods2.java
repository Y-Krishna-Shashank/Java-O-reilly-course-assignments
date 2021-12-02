public class StringMethods2 {
    public static void main(String[] args) {
        String myName = "Krishna Shashank Yadava";
        String upper=myName.toUpperCase();
        String lower= myName.toLowerCase();

        int whereIsY = myName.indexOf("Y");
        String lastName= myName.substring(17
        );
        System.out.println("Upper is "+upper);
        System.out.println("Lower is "+lower);
        System.out.println("Y is at index "+whereIsY);
        System.out.println("Last name is "+ lastName);
    }
}
