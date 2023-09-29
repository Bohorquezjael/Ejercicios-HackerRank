package EjerciciosHackerRank;
import java.util.Scanner;

public class IntroduccionStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        String B = sc.nextLine();
        int c = A.length() + B.length();
        System.out.println(c);

        int pos = A.compareTo(B);
        if (pos > 0 ){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        System.out.println((A.substring(0, 1).toUpperCase() + A.substring(1) + " ")
                .concat((B.substring(0, 1).toUpperCase() + B.substring(1))));
        sc.close();
    }
}