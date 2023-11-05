import java.util.Scanner;

public class BusquedaEnUnArreglo18614 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arreglo[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int num = 0;
        String palabra = " ";
        num = sc.nextInt();
        while(num > 0){
            for(int i = 0; i < arreglo.length; i++){
                if (arreglo[i] == num){
                    palabra = "existe";
                    break;
                }else{
                    palabra = "no existe";
                }
            }
            System.out.println(palabra);
            num = sc.nextInt();
        }
        sc.close();
    }
}
