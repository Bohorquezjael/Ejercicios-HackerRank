package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class CalculoDeSumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int n = sc.nextInt();
        //! Siempre tomar en cuenta el valor de entrada y que la sumatoria puede ser un numero muy grande 
        long suma = (long) n * (n + 1) / 2;
        
        System.out.println("La suma de los números enteros desde 1 hasta " + n + " es: " + suma);
        sc.close();
    }
}
