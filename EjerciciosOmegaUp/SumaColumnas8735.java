import java.util.Scanner;

public class SumaColumnas8735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int arr[] = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j] += sc.nextInt();
            }
        }
        sc.close();
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
