import java.util.Scanner;

public class InvierteNumero3167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 
        String numero = sc.nextLine();
        sc.close();
        for (int i = numero.length() - 1; i >= 0 ; i--) {
            System.out.print(numero.charAt(i));
        }
        // while(numero > 0){
        //     System.out.print(numero % 10);
        //     numero /= 10;
        // }
    }
}
