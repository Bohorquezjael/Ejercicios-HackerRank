



import java.util.Scanner;

public class ProductoPuntoDeDosVectores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large = sc.nextInt();
        int total = 0;
        int values[][] = new int[2][large];
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < large; j++){
                values[i][j] = sc.nextInt(); 
            }
        }
        for(int z = 0; z < large; z++){
            total += (values[0][z] * values[1][z]);
        }
        System.out.println(total);
        sc.close();
    }
}
