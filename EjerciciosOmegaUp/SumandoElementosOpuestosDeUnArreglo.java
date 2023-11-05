import java.util.Scanner;

public class SumandoElementosOpuestosDeUnArreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), restador = 1;
        int numbers[] = new int[n];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.printf("%d ", numbers[i] + numbers[numbers.length - restador]);
            restador++;
        }
    }
}
