public class StringBuilderPractice {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Krishna Shashank");
        sb.append(" is a associate software engineer");
        System.out.println(sb);

        sb.insert(16," Yadava");
        System.out.println(sb);

        sb.replace(8, 16, "Karna");
        System.out.println(sb);

        sb.delete(14,20);
        System.out.println(sb);

        sb.replace(0, 7, "Mr.");
        System.out.println(sb);
    }
}
