

import java.util.Scanner;

public class IgnorandoLosUltimosResultados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String numeros = sc.nextLine();
        String numbers[] = numeros.split(" ");
        int k = sc.nextInt();
        for (int i = 0; i < numbers.length - k; i++) {
            System.out.print(Integer.parseInt(numbers[i]) + " ");
        }
    }
}