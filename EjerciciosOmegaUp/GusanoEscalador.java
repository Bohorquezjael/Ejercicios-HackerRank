import java.util.Scanner;

public class GusanoEscalador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), u = sc.nextInt(), d = sc.nextInt(), contador = 0;
        while (n > 0) {
            contador++;
            if (contador % 2 == 0) {
                n += d;
            } else {
                n -= u;
            }
        }
        System.out.println(contador);
    }
}