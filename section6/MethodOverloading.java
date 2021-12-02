public class MethodOverloading {
    public static void main(String[] args) {

    }
    public static void doSomething(){
        System.out.println("In doSomething!");
int result=getSomeValue();
        System.out.println("result: "+result);
    }
    public static int getSomeValue(){

        return 150;
    }
}
