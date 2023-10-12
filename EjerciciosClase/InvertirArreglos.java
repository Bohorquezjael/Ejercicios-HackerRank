


import java.util.Scanner;

public class InvertirArreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lerge = sc.nextInt();
        char palabra[] = new char[lerge];
        for (int i = 0; i<lerge; i++){
            char arreglo = sc.next().charAt(0);
            palabra[i] = arreglo;
        }
        sc.close();
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