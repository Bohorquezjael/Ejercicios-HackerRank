import java.util.Scanner;

public class Nombres1id4587 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String nombres[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                nombres[i][j] = sc.next();
            }
        }
        sc.close();
        for(int i = 0; i < n; i++){
            System.out.println(nombres[i][0]);
        }
        for(int i = 0; i < n; i++){
            System.out.println(nombres[i][1]);
        }
    }
}