import java.util.Scanner;

public class LaMurallaInterminableDeHumbaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        String muros = Character.toString(pal.charAt(0));
        int conta = 1, i = 1;
        while(muros.length() <= pal.length()){
            String tmp = pal.substring(muros.length(), muros.length() + 1);
            conta += muros.equals(tmp) ? 0 : 1;
            muros += pal.charAt(i);
            i++;
        }
        System.out.println(conta);
    }
}
