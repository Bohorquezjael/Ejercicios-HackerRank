



import java.util.Scanner;

public class BonitaPatria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int conta = 1;
        if (n < 40 && n >= 1) {
            double ninios[] = new double[n];
            for (int i = 0; i < ninios.length; i++) {
                ninios[i] = sc.nextDouble();
            }
            double mayor = ninios[0];
            for (int j = 0; j < ninios.length; j++) {
                if (ninios[j] > mayor) {
                    mayor = ninios[j];
                    conta = j +1;
                }
            }
            System.out.println(conta);
            sc.close();
        } else {
            System.out.println("ERROR");
        }
    }
}
