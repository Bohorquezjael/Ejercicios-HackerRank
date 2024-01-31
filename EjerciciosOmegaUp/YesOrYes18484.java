import java.util.Scanner;

public class YesOrYes18484 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String pal = sc.nextLine().toLowerCase();
            System.out.println(pal.equals("yes") ? "YES" : "NO");
        }
    }
}