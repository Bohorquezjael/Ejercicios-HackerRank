import java.util.Scanner;

public class TablasDeMultiplicacionv2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numero = sc.nextInt();
        System.out.println("Ingresa hasta que numero quieras terminar");
        int tablas = sc.nextInt();
        sc.close();


        
            System.out.println("");
            for(int i = numero; i <= tablas; i++){
            
                for (int j = 2; j <= tablas; j++){
                    System.out.printf("%d ");
                }
                System.out.println();
            }
            
        

    }
}
