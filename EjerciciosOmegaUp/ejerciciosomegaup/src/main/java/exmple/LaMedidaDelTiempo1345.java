package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class LaMedidaDelTiempo1345 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tiempo = sc.nextInt(), counter = 0;
        sc.close();
        if(tiempo == 0){
            System.out.println("0 0 0 0 0");
        }else{
        int tiempos[] = {31557600, 86400, 3600, 60, 1};
        while(tiempo > 0){
            System.out.print(tiempo / tiempos[counter] + " ");
            tiempo %= tiempos[counter];
            counter++;
        }
    }
    }
}
