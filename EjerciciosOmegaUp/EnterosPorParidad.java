package EjerciciosOmegaUp;

import java.util.Scanner;

public class EnterosPorParidad {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = sc.nextInt();
        int[] numbers = new int[index];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int flag = sc.nextInt();
        for (int i = 0; i < numbers.length; i++) {
            if(flag == 0 && numbers[i]%2 == 0){
                System.out.print(numbers[i] + " ");
            }else if(flag == 1 && numbers[i]%2 == 1){
                System.out.print(numbers[i] + " ");
            }
        }

        sc.close();
    }
}
