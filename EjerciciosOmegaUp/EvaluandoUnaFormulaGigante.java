



import java.util.Scanner;

public class EvaluandoUnaFormulaGigante {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double dividendo = ((2 * x + y)/z) *  (Math.pow(y ,3) - z);
        double divisor = ((x + (2 * y) + (3 * z))/ (z - (2 * y) - (3 * x))) + Math.pow(x, 2) + Math.pow(z, 2);
        
        System.out.println(dividendo / divisor);
        sc.close();
    }
}