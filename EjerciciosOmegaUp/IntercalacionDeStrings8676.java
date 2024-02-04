import java.util.Scanner;

public class IntercalacionDeStrings8676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        
        for (int i = s1.length() - 1; i >= 0; i--) {
            System.out.print(s1.charAt(i));
            System.out.print(s2.charAt(i));
        }
    }
}
