import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            sc.nextLine();
            String s = sc.nextLine();
            if ("Insert".equals(s)) {
                int a = sc.nextInt(), b = sc.nextInt();
                numbers.add(a, b);
            } else if ("Delete".equals(s)) {
                int b = sc.nextInt();
                numbers.remove(b);
            }
        }

        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
    }
}
