import java.util.Random;
import java.util.Scanner;

public class PruebaExamenArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arregloDeNumeros[] = new int[5];
        int arregloDeNumerosCopia[] = new int[5];
        int i, j = arregloDeNumeros.length - 1;
        Random valoresGenerados = new Random(100);
        for (int l = 0; l < arregloDeNumeros.length; l++) {
            arregloDeNumeros[l] = valoresGenerados.nextInt(100);
        }
        
        System.out.println();
        for (i = 0; i <= j; i++, j--) {
            arregloDeNumerosCopia[i] = arregloDeNumeros[i];
            arregloDeNumerosCopia[j] = arregloDeNumeros[j];
        }
        System.out.println("Arreglo original:");
        for (int k : arregloDeNumeros) {
            System.out.print(k + " ");
        }
        System.out.println("Arreglo destino de la copia");
        for (int k : arregloDeNumerosCopia) {
            System.out.print(k + " ");
        }
    }
}
