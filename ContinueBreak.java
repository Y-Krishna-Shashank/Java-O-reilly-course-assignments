public class ContinueBreak {
    public static void main(String[] args) {
        int count=0;
        while(count<10)
        {
            if(count==5) {

                break;
            }
            System.out.print("count: "+count+"\t");
            count++;
        }
    }
}
