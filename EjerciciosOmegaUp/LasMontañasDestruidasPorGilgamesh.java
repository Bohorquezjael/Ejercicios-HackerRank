import java.util.Scanner;

public class LasMontañasDestruidasPorGilgamesh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alturaMontanias[] = new int[n];
        String nombreMontanias[] = new String[n];
        for (int i = 0; i < n; i++) {
            alturaMontanias[i] = sc.nextInt();
            nombreMontanias[i] = sc.next();
        }
        selectionSort(alturaMontanias, nombreMontanias);
        for (String s : nombreMontanias) {
            System.out.println(s);
        }
    }

    private static void selectionSort(int[] alturaMontanias, String[] nombreMontanias) {
        for (int i = 0; i < nombreMontanias.length; i++) {
            int index = i;
            for (int j = i; j < nombreMontanias.length; j++) {
                if(alturaMontanias[j] > alturaMontanias[index]){
                    index = j;
                }
            }
            int tmp = alturaMontanias[i];
            alturaMontanias[i] = alturaMontanias[index];
            alturaMontanias[index] = tmp;
            String tmp2 = nombreMontanias[i];
            nombreMontanias[i] = nombreMontanias[index];
            nombreMontanias[index] = tmp2;
        }
    }
}
