import java.util.ArrayList;
import java.util.Scanner;

public class GlobosParaIcpc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt(), m = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            for(int j = x; j <= n; j += x){
                if(!lista.contains(j)){
                    lista.add(j);
                }
            }
        }
        System.out.println(n - lista.size());
    }
}


/*
 * Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), suma = 0;
        ArrayList<Integer> list = new ArrayList<>(n);
        HashSet<Integer> conjuntos = new HashSet<>();
        for(int i = 1; i <= n; i++){
            list.add(i);
        }

        for(int i = 0; i < m; i++){
            int x = sc.nextInt();
            for(int j = x; j <= n; j += x){
                conjuntos.add(j);
            }
        }
        for (Integer ele : conjuntos) {
            list.remove(ele);
        }
        System.out.println(list.size());
 */