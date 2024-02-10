import java.util.Scanner;

public class DistanciaManhattan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
            System.out.println(Math.abs(x1 - x2) + Math.abs(y1 - y2));
        }
    }
}