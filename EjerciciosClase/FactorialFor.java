

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        long total = 1L;
        for(int i = 1; i <= numero; i++){
            total *= i;
        }
        System.out.println(total);
        sc.close();
    }
}
