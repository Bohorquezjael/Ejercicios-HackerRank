import java.util.Scanner;

public class FibonacciRecursivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(calculaNFibonacci(n));
        
    }

    private static long calculaNFibonacci(int i) {
        if(i == 0){
            return 0;
        }else if(i == 1){
            return 1;
        }else{
            return calculaNFibonacci(i - 1) + calculaNFibonacci(i - 2);
        }
    }
}
