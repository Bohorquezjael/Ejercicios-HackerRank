import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
//FIXME
public class LosCaracteresRepetidos18948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        HashSet<Character> minusculas = new HashSet<>();
        HashSet<Character> mayusculas = new HashSet<>();

        for (char x : pal.toCharArray()) {
            if(Character.isUpperCase(x)){
                mayusculas.add(x);
            }else{
                minusculas.add(x);
            }
        }
        char minus[] = minusculas.toString().toCharArray();
        char mayus[] = mayusculas.toString().toCharArray();
        Arrays.sort(minus);
        Arrays.sort(mayus);
        for (char c : minus) {
            if(Character.isLetter(c))
            System.out.print(c);
        }
        System.out.print(" ");
        for (char c : mayus) {
            if(Character.isLetter(c))
            System.out.print(c);
        }
    }
}
