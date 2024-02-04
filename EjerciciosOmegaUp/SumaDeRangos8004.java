import java.util.Scanner;

public class SumaDeRangos8004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sumaN = n * (n + 1) / 2, control = 0, control2 = 0, sumatoria = 0;
        for(int i = 0; i < n - 1; i++){
            control2 += n - (i + 1);
            sumatoria += (sumaN - control) + control2;
            control += (i + 1);
        }
        System.out.println(sumatoria);
    }
}
