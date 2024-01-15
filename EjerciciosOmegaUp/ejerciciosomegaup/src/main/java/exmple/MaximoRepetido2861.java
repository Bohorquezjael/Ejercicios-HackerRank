package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class MaximoRepetido2861 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nNumeros = sc.nextInt(), mayor = 0, contador = 0;
        int numeros[] = new int[nNumeros];
        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
            mayor = numeros[i] > mayor ? numeros[i] : mayor; 
        }

        for (int i = 0; i < numeros.length; i++) {
            contador += numeros[i] == mayor ? 1 : 0; 
        }
        System.out.println(contador);
    }
}
