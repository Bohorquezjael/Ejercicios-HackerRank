package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class FiltrandoMultiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int large = sc.nextInt();
        int lista[] = new int[large];

            for(int i = 0; i < lista.length; i++){
                lista[i] = sc.nextInt();
            }
            
        int busqueda = sc.nextInt();
        sc.close();
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i] % busqueda == 0){
                System.out.print(lista[i] + " ");
            }else{
                System.out.print("X ");
            }
        }

    }
}
