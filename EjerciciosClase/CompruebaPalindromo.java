import java.util.Scanner;

public class CompruebaPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String pa = sc.nextLine();
            palindrome(pa);
        }
    }

    public static void palindrome(String pa) {
        boolean flag = true;
        String pas = pa.trim().toLowerCase();
        for (int i = 0; i < pas.length() / 2 && flag == true; i++) {
            flag = pas.charAt(i) == pas.charAt((pas.length() - 1) - i) ? true : false;
        }
        System.out.println(flag ? "P" : "NP");
    }
}
