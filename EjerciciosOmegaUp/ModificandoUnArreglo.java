

import java.util.Scanner;

public class ModificandoUnArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int arr[] = new int [n]; 
        for(int i = 1; i <= m; i++){
            int num = sc.nextInt();
            arr[num] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
