
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        double radio = sc.nextDouble();
        System.out.println("El area del circulo es: " + Math.PI * Math.pow(radio, 2));
        System.out.println("EL perimetro del circulo es: " + (2* Math.PI) *radio);
        sc.close();
    }
}
