import java.util.Scanner;

public class ConsonantesYVocales6171 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        char vocales[] = {'A', 'E', 'I', 'O', 'U'};
        int sumaVocales = 0;
        for (Character cas : vocales) {
            sumaVocales += palabra.chars().filter(ch -> ch == cas).count();
        }
        System.out.println(palabra.length() - sumaVocales + " " + sumaVocales);
    }
}
