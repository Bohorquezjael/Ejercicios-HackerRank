
import java.util.Random;
import java.util.Scanner;

public class arreglo2 {
    public static void main(String args[]) {
        final int MAX_VALORES  = 10;
        double datos[] = new double[MAX_VALORES];
        Random numero = new Random();
        double total = 0, promedio, min, max;
        int p = 0;
        
        Scanner teclado = new Scanner(System.in);
        for (p = 0; p < MAX_VALORES; p++) {
                datos[p] = numero.nextInt(100);
        }
        System.out.println("elige operacion");
        System.out.println("1 obtener total");
        System.out.println("2 obtener promedio");
        System.out.println("3 valor maximo");
        System.out.println("4 valor minimo");
        System.out.println("5 terminar");
        int opcion = teclado.nextInt();

        for (int i = 0; i < datos.length; i++) {
            System.out.println("valores generados " + datos[i]);
        }
        switch (opcion) {
            case 1:
                for (p = 0; p < datos.length; p++)
                    total = total + datos[p];
                System.out.println("TOTAL " + total);
                break;
            case 2:
                max = 0;
                for (p = 0; p < datos.length; p++)
                    if (datos[p] > max)
                        max = datos[p];
                System.out.println("MAXIMO " + max);
                break;
            case 3:
                min = 0;
                for (p = 0; p < datos.length; p++) {
                    if (datos[p] < min)
                        min = datos[p];
                }
                System.out.print(min);
                break;

            case 4:
                for (p = 0; p < datos.length; p++) {
                    total = total + datos[p];
                }
                promedio = total / datos.length;
                System.out.println(promedio);
                break;

            case 5:
                System.out.println("NO SE HIZO NINGUNA OPERACION");
                break;
        }

    }
}