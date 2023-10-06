package EjerciciosClase;


import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberF = sc.nextInt();
        sc.close();
        System.out.println("El numero de fibonnaci es: "+fiboOp(numberF));
        
    }
    public static int fiboOp(int number){
        if (number == 0){
            return 0;
        }else if (number == 1){
            return 1;
        }else{
            return fiboOp(number-2)+ fiboOp(number -1 );
        }
    }
}
