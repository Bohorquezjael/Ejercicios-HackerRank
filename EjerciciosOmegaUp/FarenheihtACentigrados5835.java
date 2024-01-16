

import java.util.Scanner;

public class FarenheihtACentigrados5835 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int faren = sc.nextInt();
        System.out.printf("%d %d", (5 * (faren - 32)) / 9, (5 * (faren - 32)) / 9 > 36 ? 1 : 0);
    }
}
