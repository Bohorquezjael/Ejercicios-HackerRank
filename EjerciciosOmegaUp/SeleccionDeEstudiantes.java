import java.util.Scanner;

public class SeleccionDeEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        String str = Integer.toString(a * b);
        System.out.println(str.charAt(str.length()-1));
    }
}
