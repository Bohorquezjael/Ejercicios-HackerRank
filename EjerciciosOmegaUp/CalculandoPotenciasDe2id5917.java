

import java.util.Scanner;

public class CalculandoPotenciasDe2id5917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println((int)(Math.log10(n) / Math.log10(2)));
    }
}
