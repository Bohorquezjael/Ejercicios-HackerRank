package EjerciciosLogica;
import java.util.Scanner;

public class precioDeCitas{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de cita");
        int ncita = sc.nextInt();
        sc.close();
        calculos(ncita);
    }   
    public static void calculos (int cita){
        int precioUnitario;
        if(cita <= 3 ){
            precioUnitario = 200; 
            System.out.println("Usted debera pagar: " + precioUnitario);
            System.out.println("Precio del tratamiento: " + cita*precioUnitario);
        }else if(cita <= 5){
            precioUnitario = 150; 
            System.out.println("Usted debera pagar: " + precioUnitario);
            System.out.println("Precio del tratamiento: " + (600 + ((cita - 3) * precioUnitario)));
        }else if(cita<=8){
            precioUnitario = 100; 
            System.out.println("Usted debera pagar: " + precioUnitario);
            System.out.println("Precio del tratamiento: " + (900 + ((cita - 5) * precioUnitario)));
        }else{
            precioUnitario = 50; 
            System.out.println("Usted debera pagar: " + precioUnitario);
            System.out.println("Precio del tratamiento: " + (1200 + ((cita - 8) * precioUnitario)));
        }
    }
}