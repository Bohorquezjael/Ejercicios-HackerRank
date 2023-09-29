
import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ladoa, ladob, ladoc;
        System.out.println("Ingrese el primer lado del triangulo");
        ladoa = sc.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo");
        ladob = sc.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo");
        ladoc = sc.nextDouble();
        comprobarLados(ladoa,ladob,ladoc);
        sc.close();
    }
    public static void comprobarLados(Double a,Double b,Double c){
        if(a ==b && a == c){
            System.out.print("El Triangulo es Equilatero ");
        }else if(a == b || b == c){
            System.out.print("El Triangulo es Isósceles ");
        }else{
            System.out.print("El Triangulo es Escaleno ");
        }

}
}