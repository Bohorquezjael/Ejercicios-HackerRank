
import java.util.Scanner;

public class PuntoEnElPlano {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa el radio del circulo");
        double radio = sc.nextDouble();
        System.out.println("Ingresa el numero de puntos");
        int puntos = sc.nextInt();
        int dentro = 0;
        int fuera = 0;
        int circu = 0;
        for (int i = 1; i <= puntos; i++) {

            System.out.println("Ingresa las coordenadas del punto separado por un espacio");
            double puntoX = sc.nextDouble();
            double puntoY = sc.nextDouble();
            double distancia = Math.sqrt(Math.pow(puntoX, 2) + Math.pow(puntoY, 2));
            if (distancia < radio) {
                System.out.println("Punto dentro del circulo");
                dentro +=1;
            } else if (distancia > radio) {
                System.out.println("Punto fuera del circulo");
                fuera += 1;
            }else{
                System.out.println("Punto en la circunferencia");
                circu +=1;
            }

        }
        System.out.printf("Hay %d puntos dentro del circulo, %d puntos fuera del circulo y %d en la circunferencia", dentro, fuera, circu);
        sc.close();
    }
}
