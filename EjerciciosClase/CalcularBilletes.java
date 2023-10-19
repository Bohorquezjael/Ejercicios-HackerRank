import java.util.Scanner;

public class CalcularBilletes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el valor del monto");
        int cantidadDinero = sc.nextInt();
        sc.close();
        int m1, m2, m20, b100, b200, b500;

        b500 = cantidadDinero/500;
        cantidadDinero %= 500;

        b200 = cantidadDinero/200;
        cantidadDinero %= 200;

        b100 = cantidadDinero/100;
        cantidadDinero %= 100;

        m20 = cantidadDinero/20;
        cantidadDinero %= 20;

        m2 = cantidadDinero/2;
        cantidadDinero %= 2;

        m1 = cantidadDinero/1;

        System.out.printf("\n %d Billetes de $500 \n %d Billetes de $200 \n %d Billetes de $100 \n %d Monedas de $20 \n %d Monedas de $2 y %d Monedas de $1", b500, b200, b100, m20, m2, m1);
    }
}
