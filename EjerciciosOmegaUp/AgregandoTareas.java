

import java.util.Scanner;

public class AgregandoTareas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int items[] = new int[n];
        int tareas = 0;

        for(int i = 0; i < items.length; i++){
            items[i] = sc.nextInt();
        }
        //revisar la documentacion --> metodo stream.count
        for(int i = 0; i < items.length; i++){
                if(p > items[i]){
                    tareas ++;
                }
        }
        System.out.println(n - tareas);
        sc.close();
    }
}