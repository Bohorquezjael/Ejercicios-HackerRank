import java.util.Scanner;

public class CalcularBilletes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el valor del monto");
        int cantidadDinero = sc.nextInt();

        System.out.println("Ingresa cuantas denominaciones hay");
        int numDenominacion = sc.nextInt();

        for(int i = 0; i < numDenominacion; i++){
            System.out.print("\n Ingrese la denominación " + (i + 1) + ": ");
            int deno = sc.nextInt();
            int cantidadBilletes = cantidadDinero / deno;
            System.out.println("Hay " + cantidadBilletes + "Billetes de " + deno);
            System.out.printf("\n %d Billetes de %d", cantidadBilletes, deno);
            cantidadDinero  = cantidadDinero % deno;
        }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Ingresa el valor del monto");
        // int cantidadDinero = sc.nextInt();
        // sc.close();
        // int nBilletes = 0;
        // int denominaciones[]  = {500, 200, 100, 20, 2, 1};
        // for(int i = 0; i < denominaciones.length; i++){
        //     nBilletes = cantidadDinero / denominaciones[i];
        //     System.out.printf("\n %d Billetes de %d", nBilletes, denominaciones[i]);
        //     cantidadDinero %= denominaciones[i];
        // }

    }
}
