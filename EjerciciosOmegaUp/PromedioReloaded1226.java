

import java.util.Scanner;

public class PromedioReloaded1226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sumatoria = 0, contador = 0;
        int numb[] = new int[n];

        for (int i = 0; i < numb.length; i++) {
            numb[i] = sc.nextInt();
            sumatoria += numb[i];
        }
        sc.close();
        sumatoria /= n;
        for (int i = 0; i < numb.length; i++) {
            contador += numb[i] > sumatoria ? 1 : 0;
        }
        System.out.println(contador);
    }
}
