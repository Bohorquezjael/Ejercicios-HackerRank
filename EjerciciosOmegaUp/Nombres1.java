import java.util.Scanner;

public class Nombres1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String personas[] = new String[n];
        //! recortar el string al momento de recibirlo ó solo mostrar la salida antes de un \t 
        //! usar un arreglo, usa de manera mas efectiva la memoria 
        for(int i = 0; i < personas.length; i++){
            personas[i] = sc.nextLine();
        }
        sc.close();
        }
}
