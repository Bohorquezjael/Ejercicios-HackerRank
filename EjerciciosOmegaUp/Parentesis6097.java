import java.util.Scanner;

public class Parentesis6097 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = sc.nextLine();
        sc.close();
        int contadorAbre = 0, contadorCierra = 0;
        //FIXME
        for (int i = 0; i < linea.length(); i++) {
            var a = linea.charAt(i) == '(' ? contadorAbre++ : contadorCierra++;
        }
        System.out.println(contadorAbre == contadorCierra ? "SI" : "NO");
    }
}