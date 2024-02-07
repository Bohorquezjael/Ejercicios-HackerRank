import java.util.Scanner;

public class ContandoDinero4220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(), b = sc.nextInt(), suma = 0;
            for (int j = a - 1; j < b; j++) {
                suma += nums[j];
            }
            System.out.println(suma);
        }
    }
}
