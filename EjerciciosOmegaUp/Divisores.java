



import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contador = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                contador += 1;
            }
        }
        System.out.println(contador);
        sc.close();
    }
}
