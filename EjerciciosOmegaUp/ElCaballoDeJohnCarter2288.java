

import java.util.Scanner;

public class ElCaballoDeJohnCarter2288 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plano = sc.nextInt(), subida = sc.nextInt(), bajada = sc.nextInt(), contador = 0;
        sc.nextLine();
        String sendero = sc.nextLine(); 
        sc.close();
        for (char ch : sendero.toCharArray()) {
            switch (ch) {
                case '-':
                    contador += plano;
                    break;
                case '/':
                    contador += subida;
                    break;
                case '\\':
                    contador += bajada;
                    break;
            }
        }

        // contador += plano * (sendero.chars().filter(ch -> ch == '-').count());
        // contador += subida * (sendero.chars().filter(ch -> ch == '/').count());
        // contador += bajada * (sendero.chars().filter(ch -> ch == '\\').count());
        System.out.println(contador);
    }
    
}
