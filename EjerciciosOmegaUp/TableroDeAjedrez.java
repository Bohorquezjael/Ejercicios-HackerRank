package EjerciciosOmegaUp;

import java.util.Scanner;

public class TableroDeAjedrez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char column = sc.next().charAt(0);
        int row = sc.nextInt();
        //!Puede ser reemplazado usando una expresion matematica usando su valor ASCII (column - 'a' + row)% 2 == 0
        switch(column){
            case 'a', 'c', 'g', 'e':
            if(row % 2 == 1){
                System.out.println("NEGRO");
            }else{
                System.out.println("BLANCO");
            }
            break;

            case 'b', 'd', 'f', 'h':
            if(row % 2 == 0){
                System.out.println("NEGRO");
            }else{
                System.out.println("BLANCO");
            }
            break;
        }

        sc.close();
    }
    
}
