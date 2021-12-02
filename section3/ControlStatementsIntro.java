public class ControlStatementsIntro {
    public static void main(String[] args) {
        int age=15;
        System.out.println(age);

        if(age>=18)
        {
            System.out.println("You can drive!");

        }
        else
        {
            System.out.println("You cannot drive yet");
        }
        System.out.println();

        for(int i=1;i<=age;i++)
        {
            System.out.println("Happy Birthday "+i);
        }
    }
}
