

import java.util.Scanner;

public class CuantoSacaste5805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linCalif = sc.nextInt();
        for(int i = 0; i < 3; i++){
            int x = sc.nextInt();
            System.out.println(linCalif > x ? "Soy Mejor" : linCalif < x ? "Shh" : "Te gano en la siguiente");
        }
    }
}
