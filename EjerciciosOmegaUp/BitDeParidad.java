

import java.util.Scanner;

public class BitDeParidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bits = sc.nextLine();
        int contador = 0;
        for(int i = 0; i < bits.length(); i++){
            if (bits.charAt(i) == '1'){
                contador++;
            }
        }
        System.out.println(contador % 2 == 0 ? bits + "0" : bits + "1");
    }
}
