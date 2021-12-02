public class ArraysChallenge {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        System.out.println("The array elements are: ");
        for (int element : array) {
            System.out.println(element);
        }
    }
}
