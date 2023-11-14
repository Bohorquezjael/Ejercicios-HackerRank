

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LosChicosDeLaOmi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> integrante = new HashMap<>();
        int integrantes = sc.nextInt();
        int mayor = 0;
        int menor = 0;

        for(int i = 0; i < integrantes; i++){
            String nombre = sc.next();
            int inteli = sc.nextInt();
            integrante.put(inteli, nombre);
            menor = inteli;
        }
        for(Integer key : integrante.keySet()){
            if(mayor <= key){
                mayor = key;
            }
            if(key < menor){
                menor = key;
            }
        }
        System.out.println(integrante.get(mayor) + " " + integrante.get(menor));
        sc.close();
    }
}
