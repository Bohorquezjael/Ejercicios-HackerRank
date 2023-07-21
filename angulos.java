import java.util.Scanner;

public class angulos{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un angulo en grados");
        double angulo = sc.nextDouble();
        sc.close();
        angulo = angulo * Math.PI / 180;
        System.out.println("El seno del angulo es: " + Math.sin(angulo) + "\nEl Coseno del angulo es: " + Math.cos(angulo));
    }
}