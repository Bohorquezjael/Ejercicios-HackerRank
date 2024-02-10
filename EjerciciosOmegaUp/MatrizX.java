import java.util.Scanner;

public class MatrizX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int mat[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = a - 1; i >= 0; i--) {
            for (int j = 0; j < b; j++) {
                if ((i % 2 == 0 & j % 2 == 0) || (i == 0 && j % 2 == 0) || (j == 0 && i % 2 == 0)) {
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
    }
}