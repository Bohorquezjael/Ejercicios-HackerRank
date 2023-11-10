import java.util.Scanner;

public class CamellosYSerpientes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 1; i <= n; i++){
            String palabra = sc.nextLine();
            String palabraDividida[] = palabra.split("(?=[A-Z])");
            String palabraFinal = String.join("_", palabraDividida);
            System.out.println(palabraFinal.toLowerCase());
        }
        sc.close();
    }
}
