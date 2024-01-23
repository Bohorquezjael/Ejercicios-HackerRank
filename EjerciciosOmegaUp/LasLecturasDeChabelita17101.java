import java.util.Scanner;

public class LasLecturasDeChabelita17101 {
    public static void main(String[] args) {
        //? todo demasiado tiempo
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        long suma = 0;
        for (int i = 0; i < casos; i++){
            long n = sc.nextInt(), m = sc.nextInt();
            for(int j = 1; j <= n; j++){
                if(j % m == 0){
                    suma += j % 10;
                }
            }
        }
        System.out.println(suma);
    }
}
