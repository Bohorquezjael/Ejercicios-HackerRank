package EjerciciosClase;



import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Suma de dos numeros \n Ingrese el primer numero");
        Double n1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero");
        Double n2 = sc.nextDouble();
        esNegativo(n1, n2);
        sc.close();
    }
    public static void esNegativo(Double x, Double y){
        if (x<0){
            x *= -1;
        }else if(y<0){
            y *= -1;
        }
        System.out.println(x + y);
    }
}
