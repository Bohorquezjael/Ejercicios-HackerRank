public class CuadradoMagico {
    public static void main(String[] args) {
        // int n = Integer.parseInt(args[0]);
        int n = 3;
        if (n % 2 == 0)
            throw new RuntimeException("n deber ser par adios");

        int mat[][] = new int[n][n];
        int r = n - 1;
        int c = n / 2;

        for (int i = 1; i <= n * n; i++) {
            if (mat[(r + 1) % n][(c + 1) % n] == 0) {
                r = (r + 1) % n;
                c = (c + 1) % n;
                mat[r][c] = i;
            } else {
                r = (r - 1 + n) % n;
                mat[r][c] = i;
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("%3d", mat[i][j]);
            }
            System.out.println();
        }
    }
}