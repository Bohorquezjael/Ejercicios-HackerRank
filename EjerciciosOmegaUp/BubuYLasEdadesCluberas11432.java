import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//posible refactor 
public class BubuYLasEdadesCluberas11432 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numerosss = sc.nextLine();
        Scanner letras = new Scanner(numerosss);
        
        List<Integer> numeros = new ArrayList<>();
        try{
        do{
            int numero = letras.nextInt();
            numeros.add(numero);
        }while(letras.hasNext());
    }catch(Exception e){
    }
        Collections.sort(numeros);
        for (int i = numeros.size() - 1; i >= 1 ; i--) {
            if(numeros.get(i) == numeros.get(i - 1)){
                numeros.remove(i);
            }
            
        }
        System.out.print("[");
        for (int i = numeros.size() - 1; i >= 0  ;i--) {
            System.out.printf("\'%d\'", numeros.get(i));
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        sc.close();
        letras.close();
    }
}
