package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class AliciaYLaMermeladaDeNaranja3503 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sumatoria = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(), b = sc.nextInt();
            sumatoria += a > b ? a : b; 
        }
        System.out.println(sumatoria);
    }
}
