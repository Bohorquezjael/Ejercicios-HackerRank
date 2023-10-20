import java.util.Scanner;

public class DibujarDiagonal {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingresa la longitud de la forma o 0 para terminar el programa");
            int numero = sc.nextInt();
            if (numero == 0) {
                break;
            }
            System.out.println("Ingresa el caracter que se imprimira");
            String caractere = sc.next();
            System.out.println(
                    "Dame la posicion en la que quieras imprimirlo: \n 1 - vertical \n 2 - horizontal \n 3 -diagonal izq. \n 4 -diagonal der.");
            int posicion = sc.nextInt();
            dibujar(numero, caractere, posicion);
            
        }
    }

    public static void dibujar(int longitud, String caracter, int posicion) {
        switch (posicion) {
            case 1:
                System.out.println();
                for (int i = 0; i < longitud; i++) {
                    System.out.println(caracter);
                }
                System.out.println();
                break;

            case 2:
                System.out.println();
                for (int i = 1; i < longitud; i++) {
                    System.out.print(caracter);
                }
                System.out.println();
                break;

                case 3:
                System.out.println();
                for (int i = 0; i < longitud; i++) {
                    System.out.println(caracter);
                    System.out.print(" ");
                    for (int j = 0; j < i; j++) {
                        System.out.print(" ");
                    }
                }
                break;

                case 4:
                System.out.println();
                for (int i = 0; i < longitud; i++) {
                    for (int j = longitud; j >= i; j--) {
                        System.out.print(" ");
                    }
                    System.out.println(caracter);
                }
                break;
        }
        
    }
}
