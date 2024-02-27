import java.util.Scanner;

public class NarrandoLaCarreraDeCaballos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(), delantera, dMax = 0;
        int arr[][] = new int[t][2];
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
//TODO
        for (int i = 0; i < t; i++) {
            if (arr[i][0] == arr[i][1] && i != 0) {
                System.out.println("Al minuto " + (i + 1) + " los caballos van empatados");
            }
            delantera = arr[i][0] > arr[i][1] ? 1 : 2;
            
        }
    }
}