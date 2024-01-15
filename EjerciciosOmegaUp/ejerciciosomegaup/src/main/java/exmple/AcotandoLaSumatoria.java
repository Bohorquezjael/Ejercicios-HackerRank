package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class AcotandoLaSumatoria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt(), suma = 0, iterator = 0;
        sc.close();
        while(suma < numero){
            iterator++;
            suma += (iterator + 7);
        }

        System.out.println(iterator);
    }
}
