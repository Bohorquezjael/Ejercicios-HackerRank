
import java.util.Scanner;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queries = sc.nextInt();
        for(int i = 1; i<=queries; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for (int j = 0; j<n; j++){
                a += (int)Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
