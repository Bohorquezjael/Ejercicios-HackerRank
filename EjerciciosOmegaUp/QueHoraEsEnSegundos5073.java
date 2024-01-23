import java.util.Scanner;

public class QueHoraEsEnSegundos5073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt() * 60 * 60, minutes = sc.nextInt() * 60, seconds = sc.nextInt();
        System.out.println(hours + minutes + seconds);
    }
}
