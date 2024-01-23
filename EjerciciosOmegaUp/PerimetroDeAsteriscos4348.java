import java.util.Scanner;

public class PerimetroDeAsteriscos4348 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alto = sc.nextInt(), ancho = sc.nextInt();
        for (int i = 1; i <= alto; i++) {
            for(int j = 1; j <= ancho * 2; j++){
                if(i == 1 || i == alto){
                if(j % 2 != 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }else{
                if(j == 1 || j == ancho * 2 - 1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            }
            System.out.println();
        }
    }
}