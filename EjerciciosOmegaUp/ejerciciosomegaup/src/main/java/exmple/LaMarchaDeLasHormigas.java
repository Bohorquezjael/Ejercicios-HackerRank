import java.util.Scanner;

public class LaMarchaDeLasHormigas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pasos[] = { "un", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve" };
        int a = sc.nextInt(), b = sc.nextInt(), pasosRestantes = b, c = 0;
        sc.close();
        if ((a < 1 && a > 9) || b < 1) {
            System.out.println("ERROR");
        } else {
            while (c < b) {
                System.out.print("Y ");
                for (int i = 0; i < a; i++) {
                    if (pasosRestantes > 1) {
                        System.out.print(pasos[i] + " ");
                    } else {
                        System.out.print("fin");
                        break;
                    }
                    pasosRestantes--;
                }
                System.out.println();
                c += a;
            }
        }
    }
}