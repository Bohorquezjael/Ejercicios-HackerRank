package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class SupresoresDePicos733 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nCases = sc.nextInt();

        for (int i = 0; i < nCases; i++) {
            int supressors = sc.nextInt(), total = 0;
            for (int j = 0; j < supressors; j++) {
                total += sc.nextInt();
            }
            System.out.println(total - (supressors - 1));
        }

        // for (int i = 0; i < nCases; i++) {
        //     int supressors = sc.nextInt();
        //     int contador = 0;
        //     for (int j = supressors; j >= 1; j--) {
        //         if(j > 1){
        //             contador += sc.nextInt() - 1;
        //         }else{
        //             contador += sc.nextInt();
        //         }
        //     }
        //     System.out.println(contador);
        // }
    }
}
