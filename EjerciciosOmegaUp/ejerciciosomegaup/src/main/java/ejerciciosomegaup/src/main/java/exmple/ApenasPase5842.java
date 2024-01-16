package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class ApenasPase5842 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double promedioAmigos = sc.nextDouble(), promedio = 0.0;
        int nExamenes = sc.nextInt();
        for(int i = 0; i < nExamenes; i++){
            promedio += sc.nextDouble();
        }

        System.out.println((promedio / nExamenes) > promedioAmigos ? "Presume" : "Ladra");
    }
}
