
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextInt();
        sc.close();
        //factorialop(num);
        System.out.println("El factorial de " +num+  " es: "+ factorialop(num));
    }
    public static long factorialop(long num){
        if (num == 0){
            return 1;
        }else{
            return num * (factorialop(num - 1));
        }
    }
}
