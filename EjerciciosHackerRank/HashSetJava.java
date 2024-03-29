import java.util.Scanner;
import java.util.HashSet;

public class HashSetJava {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        HashSet<String> pals = new HashSet<String>(t);
        for(int i = 0; i < t; i++){
            pals.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(pals.size());
        }
    }
}