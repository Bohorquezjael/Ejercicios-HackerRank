package EjerciciosClase;


import java.util.Scanner;

public class FormulaGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a=9, b=4, c=2;
        System.out.print("Ingrese el valor del termino cuadratico ax^2: ");
        Double a = sc.nextDouble();
        System.out.print("Ingrese el valor del termino lineal bx: ");
        Double b = sc.nextDouble();
        System.out.print("Ingrese el valor del termino independiente c: ");
        Double c = sc.nextDouble();
        procedimiento(a, b, c);
        sc.close();
    }

    public static void procedimiento(Double a, Double b, Double c) {
        Double d = (Math.pow(b, 2)) - 4 * a * c;
        if (d < 0 || a == 0) {
            System.out.println("No se puede resolver: Numero Imaginario");
        } else {
            Double raiz = Math.sqrt(d);
            Double x1 = (-b + raiz) / 2 * a;
            Double x2 = (-b - raiz) / 2 * a;
            System.out.println("El valor de X1 es:" + x1 + "\n" + "El valor de X2 es:" + x2);
        }
    }
}