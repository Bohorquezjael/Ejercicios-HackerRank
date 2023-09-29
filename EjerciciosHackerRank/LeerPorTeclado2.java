package EjerciciosHackerRank;
import java.util.Scanner;

public class LeerPorTeclado2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresa un numero entero");
        int x = scan.nextInt();
        System.out.println("ingresa un numero decimal");
        double y = scan.nextDouble();
        scan.nextLine(); //consume el enter de la linea anterior y evita que lo tome como valor para el string
        System.out.println("ingresa una cadena de caracteres");
        String z = scan.nextLine();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        scan.close();

    }
}
