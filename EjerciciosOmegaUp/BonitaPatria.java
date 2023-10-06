package EjerciciosOmegaUp;

import java.util.Scanner;

public class BonitaPatria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ninios[] = new int[n];
        int conta = 1;
        if (n < 40 && n > 0) {
            for (int i = 0; i < ninios.length; i++) {
                ninios[i] = sc.nextInt();
            }
            int mayor = ninios[0];
            for (int j = 0; j < ninios.length; j++) {
                if (ninios[j] > mayor) {
                    mayor = ninios[j];
                    conta++;
                }
            }
            System.out.println(conta);
            sc.close();
        } else {
            System.out.println("ERROR");
        }
    }
}
