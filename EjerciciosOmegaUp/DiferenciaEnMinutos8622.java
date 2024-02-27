import java.util.Scanner;

public class DiferenciaEnMinutos8622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        int diferencia = (60 - b) + ((c - a - 1) * 60) + d;
        System.out.println(diferencia);
    }
}
