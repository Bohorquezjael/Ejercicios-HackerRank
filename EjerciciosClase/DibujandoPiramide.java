import java.util.Scanner;

public class DibujandoPiramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        for(int i = 0; i < base; i++){
            for (int j = 0; j < base; j++) {
        //TODO
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
