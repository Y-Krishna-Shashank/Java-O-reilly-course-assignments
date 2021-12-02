public class RelationalOperators {
    public static void main(String[] args) {
        boolean myBool=true;
        boolean yourBool=false;
        int myAge=21;
        int yourAge=20;
        int bobsAge=20;
        String myName="Krishna Shashank";
        String yourName="John";
        System.out.println("myBool is "+myBool);
        System.out.println("yourBool is "+yourBool);
        boolean ageComparison = myAge>yourAge;
        System.out.println("myAge > yourAge?: "+ageComparison);
        ageComparison=yourAge>bobsAge;
        System.out.println("yourAge > bobsAge?: "+ageComparison);
        ageComparison=yourAge==bobsAge;
        System.out.println("yourAge == bobsAge?: "+ageComparison);

        boolean nameComparison=myName.equals(yourName);
        System.out.println("myName == yourName?: " +nameComparison);
    }
}
