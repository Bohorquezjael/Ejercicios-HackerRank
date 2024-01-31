import java.util.Scanner;

public class Canicas12826 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diametro = sc.nextInt();
        if(diametro > 0 && diametro <= 3){
            System.out.println("1");
        }else if(diametro > 3 && diametro <= 8){
            System.out.println("5");
        }else if (diametro > 8 && diametro < 10) {
            System.out.println("8");
        }
    }
}
