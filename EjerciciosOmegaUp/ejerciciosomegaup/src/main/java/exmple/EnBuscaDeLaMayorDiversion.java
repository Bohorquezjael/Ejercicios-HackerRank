package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class EnBuscaDeLaMayorDiversion {
    public static void main(String[] args) {
        //! Solo funciona en c++, java excede el limite del programa (4.8mib)
        Scanner sc = new Scanner(System.in);
        int numeroJuguetes = sc.nextInt();
        int sumaTotal = 0;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < numeroJuguetes; i++) {
            int diversion = sc.nextInt();
            menor = Math.min(diversion, menor);
            sumaTotal += diversion;
        }

        System.out.println(sumaTotal - menor);
        sc.close();
    }
}
