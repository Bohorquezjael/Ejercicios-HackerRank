package ejerciciosomegaup.src.main.java.exmple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LosUltimosSeranLosPrimeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        
        while(true){
            String nombre = sc.nextLine();

            if(nombre.charAt(0) == '#'){
                break;
            }else{
                nombres.add(nombre);
            }
        }
        sc.close();
        Collections.reverse(nombres);
        for (String nombreRev : nombres) {
            System.out.println(nombreRev);
        }
    }
}
