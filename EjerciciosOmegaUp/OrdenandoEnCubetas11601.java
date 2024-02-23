import java.util.Scanner;

public class OrdenandoEnCubetas11601 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), range = sc.nextInt();
        int buckets[] = new int[range];
        for (int i = 0; i < n; i++) {
            buckets[sc.nextInt() - 1]++;
        }
        sc.close();
        for (int i = 0; i < range; i++) {
            System.out.println(i + 1 + ": " + buckets[i]);
        }
    }
}
