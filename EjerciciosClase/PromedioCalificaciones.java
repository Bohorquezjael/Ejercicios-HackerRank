import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroUnidades, unidad = 1;
        double calificacion, promedio, sumatoria = 0;
        
        System.out.println("Ingrese el numero de unidades");
        numeroUnidades = sc.nextInt();
        
        do{
            System.out.println("Ingrese la calificacion de la unidad " + unidad + ":");
            calificacion = sc.nextInt();
            System.out.println();
            sumatoria += calificacion;
            unidad++;
        }while(calificacion >= 70 && unidad <= numeroUnidades);
        if(calificacion >= 70){
        promedio = sumatoria / numeroUnidades;
        System.out.println("El promedio es: " + promedio);
        }else{
            System.out.println("No aprobo en la unidad: " + (unidad - 1));
        }
        sc.close();
    }
}
