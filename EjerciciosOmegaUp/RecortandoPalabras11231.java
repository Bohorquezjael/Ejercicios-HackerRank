import java.util.Scanner;

public class RecortandoPalabras11231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pals = sc.nextLine();
        int n = Integer.parseInt(pals.split(" ")[1]);
        pals = pals.split(" ")[0];
        System.out.print(pals.substring(0, n));
        System.out.print(pals.substring(pals.length() - n));
    }
}
