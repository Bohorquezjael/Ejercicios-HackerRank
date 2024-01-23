import java.util.Scanner;

public class VentaDeGasolina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litrosPorDia = sc.nextInt(), litrosPorCliente = sc.nextInt();
        for(int i = 0; i < 7; i++){
            int clientes = sc.nextInt();
            int ltsRestantes = (clientes * litrosPorCliente);
            System.out.print(litrosPorDia - ltsRestantes + " ");
        }
    }
}
