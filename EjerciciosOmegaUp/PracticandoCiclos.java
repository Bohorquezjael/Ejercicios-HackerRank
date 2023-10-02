package EjerciciosOmegaUp;

import java.util.Scanner;

public class PracticandoCiclos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            while(N < 1000){
                if(N % 2 == 0){
                    for(int i = 1; i <= A; i++){
                        N += i;
                    }
                }else{
                    for(int i = 1; i <= B; i++){
                        N += i;
                    }
                }
            }
            System.out.println(N);
        sc.close();
    }
}
