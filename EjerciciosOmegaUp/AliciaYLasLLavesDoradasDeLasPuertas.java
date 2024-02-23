import java.util.Scanner;

public class AliciaYLasLLavesDoradasDeLasPuertas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int puertas[] = new int[n];
        for (int i = 0; i < puertas.length; i++) {
            puertas[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int  k = sc.nextInt();
            System.out.print(buscarPuertaCoincidente(puertas, k) + " ");
        }
    }

    private static int buscarPuertaCoincidente(int[] puertas, int k) {
        int min = 0, max = puertas.length - 1, pivot = 0;
        boolean  found = false;
        while(min <= max){
            pivot = (min + max) / 2;
            if(puertas[pivot] == k){
                found = true;
                break;
            }else{
                if(k > puertas[pivot]){
                    min = pivot  + 1;
                }else{
                    max = pivot - 1;
                }
            }
        }
        return found ? pivot + 1 : 0;
    }
}
