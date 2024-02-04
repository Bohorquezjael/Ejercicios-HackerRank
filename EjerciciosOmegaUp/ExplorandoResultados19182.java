import java.util.Scanner;

public class ExplorandoResultados19182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pals[] = sc.nextLine().toLowerCase().split(" ");
        for (String s : pals) {
            System.out.print(s.substring(0,1).toUpperCase());
            System.out.print(s.substring(1) + " ");
        }
    }
}
