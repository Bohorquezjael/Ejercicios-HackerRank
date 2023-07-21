package EjerciciosLogica;

import java.util.Scanner;

public class InvertirArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String arreglo = sc.next();
        sc.close();
        char palabra[] = new char[arreglo.length()];
        //char palabra[] = {'T','E','C','N','M'};
        char palabraInvertida [] = new char[palabra.length];
        for (int i=palabra.length-1; i>=0 ; i--){
            int iterator=0;
            palabraInvertida[iterator] = palabra[i];
            System.out.print(palabraInvertida[iterator]);
            iterator++;
        }
        
    }
}