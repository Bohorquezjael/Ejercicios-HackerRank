

import java.util.Scanner;

public class ElProblema3n1id7167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), contador = 0, mayor = n;
        sc.close();
        while(n != 1){
            if(n % 2 == 0){
                n /= 2;
            }else{
                n = (n * 3) + 1;
            }
            if(n > mayor){
                mayor = n;
            }
            contador++;
        }
        System.out.println(contador + " " + mayor);
    }
}
