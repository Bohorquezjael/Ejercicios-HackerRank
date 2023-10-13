

import java.util.Scanner;

public class Quadrants {
    //Dado un punto del plano euclideano, con el valor (x, y) enteros  devolver el cuadrante en el que se encuentra ese punto, 
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int cuadrates = (x > 0 ? y > 0 ? 1 : 4 : y < 0 ? 3 : 2);
        System.out.println(cuadrates);

        //!El codigo es repetitivo puede no ser la mejor opcion y se podria reemplazar con condiciones ternarias
        // if(x > 0 && y > 0){
        //     System.out.println(1);
        // }else if(x < 0 && y < 0){
        //     System.out.println(3);
        // }else if(x < 0 && y > 0){
        //     System.out.println(2);
        // }else if(x > 0 && y < 0){
        //     System.out.println(4);
        // }
    }

}
