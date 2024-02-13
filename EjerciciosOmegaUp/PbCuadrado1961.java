import java.util.Scanner;

public class PbCuadrado1961 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nMat[][] = new int[n][n];
        for (int i = 0; i < nMat.length; i++) {
            for (int j = 0; j < nMat.length; j++) {
                nMat[i][j] = sc.nextInt();
            }
        }

        // imprimiendo matriz a 90d
        int aux = 0;
        for (int i = 0; i < nMat.length; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(nMat[j][aux] + " ");
            }
            System.out.println();
            aux++;
        }
    }
}
