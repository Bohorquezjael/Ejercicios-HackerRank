package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class CoincidenciaDeUnaCadenaConSuReverso11427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine().toLowerCase();
        StringBuilder palabraRev = new StringBuilder(palabra).reverse();
        int contador = 0;
        sc.close();
        for (int i = 0; i < palabra.length(); i++) {
            if(palabra.charAt(i) == palabraRev.charAt(i)){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
