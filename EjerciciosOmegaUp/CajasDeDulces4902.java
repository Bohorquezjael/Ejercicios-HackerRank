import java.util.Scanner;

public class CajasDeDulces4902 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt(), k = sc.nextInt(), mayor = 0;
        int elem[] = new int[n];
        for (int i = 0; i < elem.length; i++) {
            elem[i] = sc.nextInt();
        }

        for(int i = 0; i <= n - k; i++){
            int suma = 0;
            for(int j = 0; j < k; j++){
                suma += elem[i + j]; 
            }
            if(suma > mayor){
                mayor = suma;
            }
        }
        System.out.println(mayor);
    }
}
