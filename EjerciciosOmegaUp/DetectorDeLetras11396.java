/*Escriba un programa que lea un carácter del usuario. En caso de leer una vocal mayúscula, el programa debe imprimir el carácter 'V'. En caso de leer una consonante mayúscula, el programa debe imprimir una 'C'. En caso de leer una semivocal mayúscula ('Y'), el programa debe imprimir 'S'. En caso de que no sea ninguna letra mayúscula, el programa debe leer de nuevo el carácter. El programa no se detendrá hasta leer 10 letras mayúsculas.
MUY IMPORTANTE: El programa debe estar estructurado en modulos, no todo en la funcion principal.*/

import java.util.Arrays;
import java.util.Scanner;

public class DetectorDeLetras11396 {
    public static void main(String[] args) {
        // TODO
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        String vocales[] = { "A", "E", "I", "O", "U" };
        String letras = sc.nextLine();

        for (String caracter : vocales) {
            if(letras.contains(caracter)){
                System.out.print("V");
                contador++;
            }
        }
        
        // for (int i = 0; i < letras.length() && contador <= 10; i++) {
        //     if (letras.contains(vocales)) {
        //         System.out.print("V");
        //         contador++;
        //     }
        // }
            
    }
}
