package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class SumarMatrices6180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mat[][] = new int[n * 2][n];
        for (int i = 0; i < n * 2; i++) {
            for(int j = 0; j < n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(mat[i][j] + mat[i + n][j] + " ");
            }
            System.out.println();
        }
    }
}
