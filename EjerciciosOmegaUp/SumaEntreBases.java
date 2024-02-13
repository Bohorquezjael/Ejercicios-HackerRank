/*
 * Siguiendo con tu evaluacion de la materia de matematicas discretas, se te ha encomendado 
 * realizar una suma entre bases la cual se te daran dos numeros en base m y los deberas
 * sumar e imprimir el resultado en su representacion de base 10 con el siguiente formato
 * "La suma de ***** con ***** es igual a -su representacion en cada una de las bases- y su * representacion en base 10 es : ****"
 * 
 * ||input
 *  en la entrada estandar recibiras 2 lineas la primera contendra los dos numeros separados por
 * un espacio la segunda linea contendra las bases de dichos numeros respectivamente separados por un espacio
 * 
 * //ejemplo
 * 47 12
 * 6 3
 * esto debera dar como salida :
 * La suma de 12 con 47 es igual a 27 en base 10 
*  Equivale a 43 en base 6
*  Y equivale a 1000 en base 3
 */

import java.util.Scanner;

public class SumaEntreBases{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next(), num2 = sc.next();
        int nBase1 = sc.nextInt(), nBase2 = sc.nextInt();
        long suma = (convierteBaseDecimal(num1, nBase1)) + (convierteBaseDecimal(num2, nBase2));
        System.out.printf("La suma de %s con %s es igual a %d en base 10 \nEquivale a %s en base %d\nY equivale a %s en base %d", num2, num1, suma, convierteABaseN(suma, nBase1), nBase1, convierteABaseN(suma, nBase2), nBase2);
    }

    private static String convierteABaseN(long suma, int nBase) {
        StringBuilder number = new StringBuilder();
        long sum = suma;
        while (sum != 0) {
            if(sum % nBase < 10){
            number.append(sum % nBase);
            }else{
                number.append((char)(55 + sum % nBase));
            }
            sum /= nBase;
        }
        return number.reverse().toString();
    }

    private static long convierteBaseDecimal(String num1, int nBase1) {
        long suma = 0;
        int i = 1;
        for(Character c : num1.toCharArray()){
            if(Character.isDigit(c)){
            suma += Character.getNumericValue(c) * Math.pow(nBase1, num1.length() - i);
        }else{
            suma += (int)(c - 55) * Math.pow(nBase1, num1.length() - i);
        }
        i++;
        }
        return suma;
    }
}