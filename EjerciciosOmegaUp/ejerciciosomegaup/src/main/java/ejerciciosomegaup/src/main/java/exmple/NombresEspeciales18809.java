package ejerciciosomegaup.src.main.java.exmple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NombresEspeciales18809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char wordChars[] = sc.nextLine().toCharArray();
        Map<Character, Character> diccionarioCambios = new HashMap<>();
        diccionarioCambios.put('I', '1');
        diccionarioCambios.put('Z', '2');
        diccionarioCambios.put('E', '3');
        diccionarioCambios.put('A', '4');
        diccionarioCambios.put('S', '5');
        diccionarioCambios.put('G', '6');
        diccionarioCambios.put('F', '7');
        diccionarioCambios.put('B', '8');
        diccionarioCambios.put('P', '9');
        diccionarioCambios.put('O', '0');
        diccionarioCambios.put('X', '*');
        diccionarioCambios.put('M', 'W');
        diccionarioCambios.put('R', '&');

        for (int i = 0; i < wordChars.length; i++) {
            if (diccionarioCambios.containsKey(wordChars[i])) {
                wordChars[i] = diccionarioCambios.get(wordChars[i]);
            }
        }

        for (char c : wordChars) {
            System.out.print(c);
        }

    }
}
