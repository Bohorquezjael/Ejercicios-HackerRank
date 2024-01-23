import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AbcDario6205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String palabra = sc.nextLine();
            if(palabra.length() >= 26){
            Set<Character> cont = new HashSet<>();
            for (char c : palabra.toCharArray()) {
                if(Character.isLetter(c)){
                    cont.add(Character.toLowerCase(c));
                }
            }
            if(cont.size() == 26){
                System.out.println("PERFECT");
            }else{
                System.out.println("NO WAY");
            }
        }else{
            System.out.println("NO WAY");
        }
        }
    }
}