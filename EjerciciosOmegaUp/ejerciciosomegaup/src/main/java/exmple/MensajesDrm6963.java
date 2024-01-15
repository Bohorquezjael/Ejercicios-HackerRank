package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;
//FIXME
public class MensajesDrm6963{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        char palabraRecorte1[] = palabra.substring(0, (palabra.length()) / 2).toCharArray();
        char palabraRecorte2[] = palabra.substring((palabra.length()-1) / 2).toCharArray();
        char palabraFinal[] = new char[palabraRecorte1.length];
        int valorRotacion1 = 0, valorRotacion2 = 0;

        for (int i = 0; i < palabraRecorte1.length; i++) {
            valorRotacion1 += palabraRecorte1[i]- 65;
        }
        
        for (int i = 0; i < palabraRecorte2.length; i++) {
            valorRotacion2 += palabraRecorte2[i] - 65;
        }

        for (int i = 0; i < palabraRecorte1.length; i++) {
            int valorCaracter = valorRotacion1 - 25 + palabraRecorte1[i] - 66;
            palabraFinal[i] = (char)(valorCaracter + 65);
        }
        
        for (char elem : palabraFinal) {
            System.out.print(elem);
        }
    }
}