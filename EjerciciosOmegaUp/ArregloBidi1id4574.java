

import java.util.Scanner;

public class ArregloBidi1id4574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int arreglo[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                arreglo[i][j] = i + j;
            }
        }
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(arreglo[i][j]);
            }
            System.out.println();
        }
    }
}
