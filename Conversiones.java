import java.util.Scanner;

public class Conversiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor en cm");
        double cms = sc.nextDouble();
        sc.close();
        System.out.println("Yardas: " + cms/91.44 + "\nMetros: " + cms/100 + "\nPies: " + cms/30.48 + "\nPulgadas: " + cms/2.54);
    }
}
