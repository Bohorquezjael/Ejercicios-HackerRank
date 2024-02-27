import java.util.Scanner;

public class CuantasMayusculas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        int contaMayus = 0;
        for(char c : word.toCharArray()){
            contaMayus += Character.isUpperCase(c) ? 1 : 0;
        }
        System.out.println((word.length() - contaMayus) + " " + contaMayus);
    }
}
