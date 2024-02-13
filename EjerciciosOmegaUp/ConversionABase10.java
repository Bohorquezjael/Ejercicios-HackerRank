/* 
 * En tu clase de Mate Discretas el profesor les ha pedido como evaluacion que realicen
 * un programa para saber si comprendieron el tema de sistemas de numeracion, por lo que
 * deberas convertir un numero n en base m a su representacion en base decimal 
 * 
 * ||input 
 * Leeras un numero seguido de su base y deberas imprimir lo siguiente 
 * "La representacion en base 10 del numero n en base m es: ******"
 * unicamente recibiras numeros enteros no debes preocuparte por decimales 
 * 
 * ||ejemplo 
 * 1452 7   imprimiras "La representacion en base 10 del numero 1452 en base 7 es: 429"
 * 
 * || restricciones 
 * recibiras enteros pero ten en cuenta que los mismos pueden estar representados en base 16
 * es decir que dicho numero puede contener letras, las letras unicamente seran mayusculas, la base m es maximo a base 16, se recomienda usar el tipo long para almacenar el numero convertido
 */

import java.util.Scanner;

public class ConversionABase10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int numBase = sc.nextInt();
        long suma = calculaBase(number, numBase);
        System.out.printf("La representacion en base 10 del numero %s en base %d es : %d", number, numBase, suma);
    }

    private static long calculaBase(String number, int base) {
        long suma = 0;
        int i = 1;
        for(Character c : number.toCharArray()){
            if(Character.isDigit(c)){
            suma += Character.getNumericValue(c) * Math.pow(base, number.length() - i);
        }else{
            suma += (int)(c - 55) * Math.pow(base, number.length() - i);
        }
        i++;
        }
        return suma;
    }
}