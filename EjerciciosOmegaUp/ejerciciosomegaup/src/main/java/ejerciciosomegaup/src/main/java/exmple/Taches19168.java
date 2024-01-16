package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class Taches19168 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j == i || j == (n - i) - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}