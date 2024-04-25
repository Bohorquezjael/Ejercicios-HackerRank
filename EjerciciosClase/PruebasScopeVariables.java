public class PruebasScopeVariables {
    private static int i = 99;
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i);
            break;
        }
        System.out.print(i);
    }
}
