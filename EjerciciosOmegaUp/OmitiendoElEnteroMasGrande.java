

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OmitiendoElEnteroMasGrande {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), mayor = 0;
        List<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            numeros.add(num);
            if(num >= mayor){
                mayor = num;
            }
        }
        List<Integer> numeros2 = new ArrayList<>();
        for (Integer numS : numeros) {
            if(numS != mayor){
                numeros2.add(numS);
            }
        }

        System.out.println(numeros2.size());
        if(numeros2.size() > 0){
        for (Integer elementooo : numeros2) {
            System.out.printf("%d ", elementooo);
        }
    }
    }
}
