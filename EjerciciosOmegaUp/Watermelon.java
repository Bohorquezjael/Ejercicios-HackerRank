package EjerciciosOmegaUp;

import java.util.Scanner;

public class Watermelon {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
        int weigth = sc.nextInt();
        //Tener en cuenta que si el peso es 2 nos da un impar 1
        if(weigth % 2 == 0 && weigth != 2){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
    }
        sc.close();
    }
}
