import java.util.Arrays;
import java.util.Scanner;

public class Anagramas6626 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char cad1[] = sc.nextLine().toCharArray();
        char cad2[] = sc.nextLine().toCharArray();
        Arrays.sort(cad2);
        Arrays.sort(cad1);
        System.out.println(Arrays.equals(cad1, cad2) ? "ANAGRAMA!" : "NO :(");
    }
}