import java.util.Scanner;

public class LasCartasDeDrLira {
    public static void main(String[] args) {
        //FIXME
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), contadorIz = 0, contadorDer = 0;
        sc.nextLine();
        String cardString = sc.nextLine();
        char cards[] = new char[num];
        
        for (int i = 0; i < num; i++) {
            cards[i] = cardString.charAt(i);
        }

        for (int i = 1; i < cards.length; i++) {
            if (cards[i] == cards[i - 1]) {
                char opuesta = (cards[i] == 'B') ? 'W' : 'B';
                cards[i] = opuesta;
                contadorIz++;
            }
        }
        
        for (int i = num - 1; i >= 1 ; i--) {
            if (cards[i] == cards[i - 1]) {
                char opuesta = (cards[i] == 'B') ? 'W' : 'B';
                cards[i] = opuesta;
                contadorDer++;
            }
        }
        if(contadorDer > contadorIz){
        System.out.println(contadorIz);
        }else{
            System.out.println(contadorDer);
        }
    }
}
