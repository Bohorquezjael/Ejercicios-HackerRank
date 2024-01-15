package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class LaMedidaDelTiempo1345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempo = sc.nextInt();
        int counter = 0;
        if (tiempo == 0) {
            System.out.println("0 0 0 0 0");
        } else {
            int tiempos[] = { 31536000, 86400, 3600, 60, 1 };
            while (counter < 5) {
                System.out.print(tiempo / tiempos[counter] + " ");
                tiempo %= tiempos[counter];
                counter++;
            }
            System.out.println();
        }
    }
}
