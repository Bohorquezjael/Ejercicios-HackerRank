import java.util.Scanner;
import java.util.stream.Stream;

public class PalabrasInvertidas17763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        StringBuilder word = new StringBuilder(sc.nextLine()).reverse();
        System.out.println(word);
        // for (int i = word.length() - 1; i >= 0; i--) {
        //     System.out.print(word.charAt(i));
        // }
    }
}
