package EjerciciosOmegaUp;

import java.util.Scanner;

public class AgregandoTareas {
    public static void main(String[] args) {
        //TODO
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int items[] = new int[n];
        int tareas = 0;

        for(int i = 0; i < items.length; i++){
            items[i] = sc.nextInt();
        }
        
        for(int i = 0; i < items.length; i++){
                if(p > items[i]){
                    tareas = n - (i + 1);
                }
        }
        System.out.println(tareas);
        sc.close();
    }
}