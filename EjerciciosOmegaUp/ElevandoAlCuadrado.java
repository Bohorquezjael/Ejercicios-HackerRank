

import java.util.Scanner;

public class ElevandoAlCuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(), contador = 0;
        sc.close();
        
        while(number <= 30000 && number != 1){
            number *= number;
            contador++;
        }
        System.out.printf("%d %d", number, contador);
    }
}
