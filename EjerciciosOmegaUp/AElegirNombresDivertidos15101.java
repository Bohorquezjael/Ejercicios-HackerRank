import java.util.Scanner;
//Se puede realizar sin necesidad de un arreglo
public class AElegirNombresDivertidos15101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String nombres[] = new String[n];
        for (int i = 0; i < n; i++) {
            String nombre = sc.nextLine();
            if(nombre.charAt(0) == 'E'){
                nombres[i] = nombre;
            }
        }
        sc.close();
        for (String string : nombres) {
            if(string != null){
            System.out.println(string);
            }
        }
    }
}
