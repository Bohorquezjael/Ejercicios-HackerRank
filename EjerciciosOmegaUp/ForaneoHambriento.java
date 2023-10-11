package EjerciciosOmegaUp;

import java.util.Scanner;

public class ForaneoHambriento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt() * 8;
        for(int i = 1; i <= 5; i++){
            p -= sc.nextInt();
        }
        sc.close();
        if(p > 0){
            System.out.println("FF");
        }else{
            System.out.println("FH");
        }
    }
}
