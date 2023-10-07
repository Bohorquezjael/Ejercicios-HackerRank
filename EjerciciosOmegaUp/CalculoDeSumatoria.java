package EjerciciosOmegaUp;

import java.util.Scanner;

public class CalculoDeSumatoria {
    public static void main(String[] args) {
        //TODO
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(((n + 1) * n) / 2);
        sc.close();
    }
}
