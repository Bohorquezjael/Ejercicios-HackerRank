import java.util.Scanner;

public class DibujandoFiguras3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if(j < i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}