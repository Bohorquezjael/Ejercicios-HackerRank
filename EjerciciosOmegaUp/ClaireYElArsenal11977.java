

import java.util.Scanner;

public class ClaireYElArsenal11977 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mayor = 0, indice = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x > mayor){
                mayor = x;
                indice = i + 1;
            }
        }
        System.out.println(mayor + " " + indice);
    }
}
