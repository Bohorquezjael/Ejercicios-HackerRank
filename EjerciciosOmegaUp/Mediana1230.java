import java.util.Arrays;
import java.util.Scanner;

public class Mediana1230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double pos = n / 2;
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Arrays.sort(arr);
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        if (arr.length % 2 != 0) {
            System.out.printf("%.1f", (double) (arr[(int) pos - 1]));
        } else {
            double suma = arr[(int) pos - 1] + arr[(int) pos];
            System.out.printf("%.1f", suma / 2);
        }
    }
}
