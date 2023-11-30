import java.util.Scanner;

public class Spedding11401 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), veloMayor = 0;
        for (int i = 0; i < n; i++) {
            int tiempo = sc.nextInt(), distancia = sc.nextInt();
            if (tiempo > 0 && distancia > 0) {
                veloMayor = (distancia / tiempo) > veloMayor ? (distancia / tiempo) : 0;
            }
        }
        System.out.println(veloMayor);
    }
}
