import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int myRandomNumber;

        myRandomNumber = random.nextInt();
        System.out.println("Number is:\t"+myRandomNumber);

    myRandomNumber=random.nextInt(1000);//0-999
        System.out.println("Number 0 through 999:\t"+myRandomNumber);

        myRandomNumber =random.nextInt(1000)+1;//1-1000
        System.out.println("Number 1 through 999:\t"+myRandomNumber);


    }
}
