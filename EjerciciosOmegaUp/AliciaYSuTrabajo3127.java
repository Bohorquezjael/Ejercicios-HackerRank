import java.util.Scanner;

public class AliciaYSuTrabajo3127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int arr[] = new int[n];
        boolean encontrado = false;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arr = ordenaArreglos(arr);
        // podria ser mejor usar un algoritmo de busqueda binaria y reducir el tiempo de
        // ejecucion o simplemente utilizar una lista haciendolo mas sencillo usando el
        // metodo get()
        int i = 0;
        while (!encontrado) {
            i++;
            encontrado = arr[i - 1] == m ? true : false;
        }
        System.out.println(i);
    }

    // Metodo para Ordenar Arreglo de numeros aun es mas eficiente el mergeSort que
    // implementa la clase Arrays, aunque no es mucha la diferencia
    private static int[] ordenaArreglos(int[] arr) {
        int arrtmp[] = arr.clone();
        for (int j = 0; j < arrtmp.length; j++) {
            boolean swapped = false;
            for (int i = 0; i < arrtmp.length - 1; i++) {
                if (arrtmp[i] > arrtmp[i + 1]) {
                    int tmp = arrtmp[i];
                    arrtmp[i] = arrtmp[i + 1];
                    arrtmp[i + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }

        return arrtmp;
    }
}
