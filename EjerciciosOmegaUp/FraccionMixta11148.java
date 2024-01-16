

import java.util.Scanner;

public class FraccionMixta11148 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        if(n % m != 0){
            System.out.printf("%d %d/%d", n / m, n % m, m);
        }else{
            System.out.println(n / m);
        }
    }
}
