import java.util.Scanner;

public class TablasDeMultiplicacionv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el numero: ");

        int numero = scanner.nextInt();

        System.out.print("Introduce el limite: ");

        int limite = scanner.nextInt();

        System.out.println("Tabla: " + numero + " hasta el " + limite + ":");

        System.out.print("\t");

        for (int i = 1; i <= limite; i++) {

            System.out.print(i + "\t");

        }

        System.out.println();

        for (int i = 1; i <= limite; i++) {

            System.out.print(i + "\t");

            for (int j = 1; j <= limite; j++) {

                System.out.print(i * j + "\t");

            }

            System.out.println();
        }

    }

}