import java.util.Scanner;

public class OrdenamientoPorSeleccion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
        }
        numeros = selectionSort(numeros);
        for (int i : numeros) {
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            int index = i;
            for (int j = i; j < numeros.length; j++) {
                if(numeros[j] < numeros[index]){
                    index = j;
                }
            }
            int tmp = numeros[i];
            numeros[i] = numeros[index];
            numeros[index] = tmp;
        }
        return numeros;
    }
}