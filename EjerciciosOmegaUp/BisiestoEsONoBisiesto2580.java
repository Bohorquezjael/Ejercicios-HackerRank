

import java.util.Scanner;

public class BisiestoEsONoBisiesto2580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = sc.nextInt();
        if((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0){
            System.out.println("ES BISIESTO");
        }else{
            System.out.println("NO ES BISIESTO");
        }
    }
}
