// import java.util.Scanner;

// public class AcomodandoPuntos7551 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         double suma = 0;//int suma = 0;
//         int arr[][] = new int[n][2];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < 2; j++) {
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             if (i == n - 1) {                   //
//                 suma += Math.sqrt(Math.pow(arr[i][0] - arr[0][0], 2) + Math.pow(arr[i][1] - arr[0][1], 2));
//             } else {
//                 suma += Math.sqrt(Math.pow(arr[i][0] - arr[i + 1][0], 2) + Math.pow(arr[i][1] - arr[i + 1][1], 2));
//             }
//         }
//         System.out.printf("%.2f", suma);
//     }
// }
import java.util.Scanner;

public class AcomodandoPuntos7551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int suma = 0;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                suma += Math.sqrt(Math.pow(arr[i][1] - arr[0][1], 2) + Math.pow(arr[i][0] - arr[0][0], 2));
            } else {
                suma += Math.sqrt(Math.pow(arr[i][1] - arr[i + 1][1], 2) + Math.pow(arr[i][0] - arr[i + 1][0], 2));
            }
        }
        System.out.println(suma);
    }
}