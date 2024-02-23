import java.util.Random;
import java.util.Scanner;

public class PracticaDeAlgoritmos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random r = new Random();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt(100);
        }
        ordenaArregloBubbleSort(arr);
        int nBuscado = sc.nextInt();
        System.out.println(buscaElementoBusquedaBinaria(arr, nBuscado));
    }

    private static boolean buscaElementoBusquedaBinaria(int[] arr, int nBuscado) {
        int min = 0, max = arr.length - 1, pivot;
        boolean encontrado = false;
        while (min <= max && !encontrado) {
            pivot = (min + max) / 2;
            if (nBuscado == arr[pivot]) {
                encontrado = true;
            } else {
                if (nBuscado > arr[pivot]) {
                    min = pivot + 1;
                } else {
                    max = pivot - 1;
                }
            }
        }
        return encontrado;
    }

    private static void ordenaArregloBubbleSort(int[] arr) {
        int tmp;
        boolean ordenado = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    ordenado = true;
                }
            }
            if (!ordenado) {
                break;
            }
        }
    }
}
