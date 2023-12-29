import java.util.Scanner;

public class ContandoLetras972 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contaCaracter[];
        int inicio = sc.nextInt(), fina = sc.nextInt();
        sc.nextLine();
        String pal = sc.nextLine().substring(inicio, fina + 1);
        sc.close();
        contaCaracter = sumaLetras(pal);
        ImprimeFormateado(contaCaracter);
    }

    public static int[] sumaLetras(String palabra){
        int CharContador[] = new int[26];
        for(int i = 0; i < palabra.length(); i++){
            CharContador[(int)palabra.charAt(i) - 97]++;
        }
        return CharContador;
    }

    public static void ImprimeFormateado(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%c=%d\n", (char)i + 97, arr[i]);
        }
    }
}
