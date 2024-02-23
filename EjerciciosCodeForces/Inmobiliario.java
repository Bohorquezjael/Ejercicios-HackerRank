import java.util.Scanner;

public class Inmobiliario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
        //aunque en un principio se tomo un enfoque iterativo y puede que funcione sin embargo
        //esto tal vez no sea lo mas eficiente y puede ser demasiado costoso si nos dan algun
        //dato demasiado grande, la siguiente formula parece funcionar sin embargo aun tenemos
        //que comprobarlo haciendo mas pruebas y de manera mas eficiente que el iterativo
        System.out.println((int) Math.ceil((a / b) * (c - 1)));
    }
}
