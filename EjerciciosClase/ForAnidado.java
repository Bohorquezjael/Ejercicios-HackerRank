
import java.util.Scanner;

public class ForAnidado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        sc.close();

        for(int i = 0; i <=altura; i++){
            for(int j = 0; j <= i  ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}