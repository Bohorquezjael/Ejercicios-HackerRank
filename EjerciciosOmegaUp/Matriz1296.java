

import java.util.Scanner;

public class Matriz1296 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int matriz [][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        sc.close();
        for (int i = n - 1; i >= 0; i--) {
            for(int j = 0; j < m; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
}
