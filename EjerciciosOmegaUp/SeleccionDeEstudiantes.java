import java.util.Scanner;
//FIXME
public class SeleccionDeEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        String str = Long.toString(a * b);
        System.out.println(str.charAt(str.length()-1));
    }
}
