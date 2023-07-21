import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado del rectanulo");
        double lado = sc.nextDouble();
        System.out.println("Ingresa su altura del rectangulo");
        double alto = sc.nextDouble();
        System.out.println("El area del rectangulo es: " + lado * alto);
        System.out.println("El perimetro del rectangulo es: " + (lado + alto) * 2);
        sc.close();
    }
}
