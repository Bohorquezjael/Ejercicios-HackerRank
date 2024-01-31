import java.util.Scanner;

public class Calculadora19179 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        double x = 0.0;
        for(int i = 0; i < n; i++){
            String ops = sc.nextLine();
            String ss[] = ops.split(" ");
            char op = ops.charAt(0);
            double a = Double.parseDouble(ss[1]);
            double b = Double.parseDouble(ss[2]);
            switch (op) {
                case '+':
                    x += a + b;
                    break;
                case '-':
                    x += a - b;
                    break;
                case '*':
                x += a * b;
                    break;
                case '/':
                x += a / b;
                    break;
            }
        }
        System.out.printf("%.0f", x);
    }
}