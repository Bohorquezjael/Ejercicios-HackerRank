import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparadorDeTexto19252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> pals = new ArrayList<>();
        String pal = sc.nextLine();
        while(!pal.equals("-1")){
            pals.add(pal);
            pal = sc.nextLine();
        }
        System.out.println(String.join(" - > ", pals));
    }
}
