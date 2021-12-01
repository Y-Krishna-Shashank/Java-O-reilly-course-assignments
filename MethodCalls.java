public class MethodCalls {
    public static void main(String[] args) {
        int result = getResult(5);
        System.out.println(result);


    }
    public static int getResult(int num){
        return num*2;
    }
    public static int getResult(int num1, int num2){
        return num1*num2;
    }
    public static int getResult(int num1, String value){
        return num1*Integer.parseInt(value);
    }
}
