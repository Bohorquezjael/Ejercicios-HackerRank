import java.util.Scanner;

public class AbcDario6505 {
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            String palabra = sc.nextLine();
            if(palabra.matches("?[A - Z]^")){
                System.out.println("ab");
            }
        }
    }
}
