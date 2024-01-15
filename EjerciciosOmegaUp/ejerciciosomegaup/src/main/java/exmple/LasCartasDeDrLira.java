package ejerciciosomegaup.src.main.java.exmple;

import java.util.Arrays;
import java.util.Scanner;

public class LasCartasDeDrLira {
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), contadorIz = 0, contadorDer = 0;
        sc.nextLine();
        String cardString = sc.nextLine();
        char cards[] = new char[num];
        char cardsModified[] = Arrays.copyOf(cards, cards.length);
        
        for (int i = 0; i < num; i++) {
            cards[i] = cardString.charAt(i);
        }

        for (int i = 1; i < cards.length; i++) {
            if(cards[i] == cards[i - 1]){
                char cardChar = (cards[i] == 'B') ? 'W' : 'B';
                cards[i] = cardChar;
                contadorIz++;
            }
        }

        for (int i = cards.length - 2; i >= 1 ; i--) {
            if(cardsModified[i] == cardsModified[i + 1]){
                char cardChar = (cardsModified[i] == 'B') ? 'W' : 'B';
                cardsModified[i] = cardChar;
                contadorDer++;
            }
        }
        System.out.println(Math.min(contadorIz, contadorDer));
    }
}
