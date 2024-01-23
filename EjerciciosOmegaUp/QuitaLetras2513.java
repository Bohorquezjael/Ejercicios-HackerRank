import java.util.Scanner;

public class QuitaLetras2513 {
    //! ERROR DE OMEGA??
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine(), letrasQuitar = sc.nextLine();
        for (char c : letrasQuitar.toCharArray()) {
            palabra = palabra.replace(String.valueOf(c), "");
        }
        System.out.println(palabra);
    }
}
