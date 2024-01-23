import java.util.Scanner;

public class FrecuenciaDeUnaLetra11232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String argus[] = sc.nextLine().split(" ");
        var contador = argus[0].chars().filter(ch -> ch == argus[1].charAt(0)).count();
        // for (Character s : argus[0].toCharArray()) {
        //     contador += (s == argus[1].charAt(0)) ? 1 : 0;
        // }
        System.out.println(contador);
    }
}
