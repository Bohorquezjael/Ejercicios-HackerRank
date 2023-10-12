

import java.util.Scanner;

public class PensionRecibe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        int mes = sc.nextInt();
        int dia = sc.nextInt();

        System.out.println((2023 - anio) > 17? mes > 10 ? "No Recibe" : dia < 5 ? "No Recibe" : "Recibe Pension Este Año" : "No Recibe");
        sc.close();
    }
}
