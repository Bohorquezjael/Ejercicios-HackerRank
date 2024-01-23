import java.util.Scanner;

public class Tetris17409{
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), suma = 0, tmp = 0;
        int values[] = {40, 100, 300, 1200};
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if(x == tmp && x == 4){
                values[x - 1] += 200;
            }else{
                values[3] = 1200;
            }
            suma += values[x - 1];
            tmp = x;
        }
        System.out.println(suma);
    }
}