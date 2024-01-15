package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class ApilandoDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i <= n; i++){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
        }

        for(int i = (n - 1); i >= 0 ; i--){
            System.out.println();
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
        }
    }
}
