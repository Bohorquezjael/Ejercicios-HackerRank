import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la longitud de la forma o 0 para terminar el programa");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            System.out.println("Ingresa el caracter que se imprimirá");
            String caracter = sc.next();
            System.out.println(
                    "Dame la posición en la que quieras imprimirlo: \n 1 - vertical \n 2 - horizontal \n 3 - diagonal izq. \n 4 - diagonal der.");
            int posicion = sc.nextInt();
            dibujar(numero, caracter, posicion);
        }
    }

    public static void dibujar(int longitud, String caracter, int posicion) {
        switch (posicion) {
            case 1:
                System.out.println();
                int i = 0;
                while (i < longitud) {
                    System.out.println(caracter);
                    i++;
                }
                System.out.println();
                break;

            case 2:
                System.out.println();
                int j = 1;
                while (j < longitud) {
                    System.out.print(caracter);
                    j++;
                }
                System.out.println();
                break;

            case 3:
                System.out.println();
                int k = 0;
                while (k < longitud) {
                    System.out.println(caracter);
                    System.out.print(" ");
                    int m = 0;
                    while (m < k) {
                        System.out.print(" ");
                        m++;
                    }
                    k++;
                }
                System.out.println();
                break;

            case 4:
                System.out.println();
                int p = 0;
                while (p < longitud) {
                    int q = longitud;
                    while (q >= p) {
                        System.out.print(" ");
                        q--;
                    }
                    System.out.println(caracter);
                    p++;
                }
                System.out.println();
                break;

                default:
                System.out.println("Opcion no valida");
        }
    }
}
