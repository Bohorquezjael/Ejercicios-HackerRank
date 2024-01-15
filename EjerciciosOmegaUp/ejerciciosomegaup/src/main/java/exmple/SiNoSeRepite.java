package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class SiNoSeRepite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a == b ? "SI" : a == c ? "SI" : b == c ? "SI" : "NO"));
        sc.close();
    }
}
