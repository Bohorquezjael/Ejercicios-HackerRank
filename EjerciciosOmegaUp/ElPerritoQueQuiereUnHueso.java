package EjerciciosOmegaUp;

import java.util.Scanner;

public class ElPerritoQueQuiereUnHueso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int huesos[] = new int[4];

        for(int i = 0; i < huesos.length; i++){
            huesos[i] = sc.nextInt();
        }

        sc.close();

        if(huesos[0] > huesos[2] && huesos[1] > huesos[3]){
            System.out.println("Hueso 1");
        }else if(huesos[0] < huesos[2] && huesos[1] < huesos[3]){
            System.out.println("Hueso 2");
        }else{
            System.out.println("Perrito confundido :(");
        }
    }
}
