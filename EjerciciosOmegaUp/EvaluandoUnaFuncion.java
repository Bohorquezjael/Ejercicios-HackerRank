import java.util.Scanner;

public class EvaluandoUnaFuncion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        System.out.println(funcion(numero));
    }
    
    public static int funcion(int numero){
        if(numero == 0){
            return 1;
        }else if(numero < 0){
            return funcion(-numero) + funcion(numero + 1) + 2;
        }else{
            return funcion(-numero + 1) + 1;
        }
    }
}
