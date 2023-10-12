import java.util.Scanner;

public class ElevadoX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el numero de elementos");
        int elementos = sc.nextInt();
        System.out.println("Ingrese el valor de x");
        double x = sc.nextDouble(), eX = 1;
        sc.close();

        for(int i = 1; i <= elementos; i++){
            eX += ElevaAPotenciaN(x, i) / CalculaFactorial(i);
        }
        System.out.println(eX);
        }

        public static long CalculaFactorial(int numero){
            long total = 1;
            for(int i = 1; i <= numero; i++){
                total *= i;
            }
            return total;
        }

        public static double ElevaAPotenciaN(double termino, int potencia){
            double numeroElevado = 0;

            numeroElevado = Math.pow(termino, potencia);

            return numeroElevado;
        }
}
