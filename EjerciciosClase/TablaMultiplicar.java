
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        System.out.println("Ingresa hasta que numero quieras terminar");
        int tablas = sc.nextInt();
        sc.close();


        

            for(int i = numero; i <= tablas; i++){
                for (int j = 2; j <= 10; j++){
                    System.out.printf("%d x %d = %d \n", i, j, i * j);
                }
                System.out.println();
            }
            
        

    }
}
