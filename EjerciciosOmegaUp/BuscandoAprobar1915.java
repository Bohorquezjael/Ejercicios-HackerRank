import java.util.Scanner;

public class BuscandoAprobar1915 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 1; i <= 10; i++) {
            int contador = 0;
            for (int j = 0; j < n; j++) {
                if (numbers[j] == i) {
                    contador++;
                }
            }
            System.out.println(i + ": " + contador);
        }
    }
}