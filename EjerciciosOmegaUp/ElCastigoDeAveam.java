import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ElCastigoDeAveam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        // int mat[][] = new int [a][b];
        //tratar de usar un arraylist 2d o un array para mejorar el tiempo y memoria usada
        //tomar en cuenta que el tamaño de la estructura debera ser de la matriz a*b
        HashMap<Integer, Integer> coleccion = new HashMap<>();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                // mat[a][b] = sc.nextInt();
                int x = sc.nextInt();
                if (!coleccion.containsKey(x)){
                    coleccion.put(x, 1);
                }else{
                    coleccion.put(x, coleccion.get(x) + 1);
                }
            }
        }
        int arr[] = new int [coleccion.size()];
        int z = 0;
        for(int key : coleccion.keySet()) {
            arr[z] = key;
            z++;
        }

        Arrays.sort(arr);
        for(int k : arr){
            System.out.print(coleccion.get(k) + " ");
        }
    }
}
