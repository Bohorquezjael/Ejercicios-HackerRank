import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class BorrandoNumeros16183 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();
        List <Integer> numeros2 = new ArrayList<>();
        for (String s : numbers.split(" ")) {
            numeros2.add(Integer.parseInt(s));
        }
        int x = sc.nextInt();
        Iterator<Integer> it = numeros2.iterator();
        while (it.hasNext()) {
            int xx = it.next();
            if(xx == x){
                it.remove();
            }
            
        }

        for (Integer c : numeros2) {
            System.out.print(c + " ");
        }
    }
}
