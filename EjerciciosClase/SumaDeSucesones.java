


import java.util.Scanner;

public class SumaDeSucesones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresa el primer valor de la sucesion");
        int primerValor = sc.nextInt();
        System.out.println("ingresa el ultimo valor de la sucesion");
        int ultimoValor = sc.nextInt();
        int tmp = 0;
        sc.close();
        for(int i = primerValor; i <= ultimoValor; i++){
            tmp += i;
        }
        System.out.println("La suma es: " + tmp);
    }
}