import java.util.*;

public class SubStringsComparation {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k), largest = s.substring(0, k);
        for (int i = 0; i < s.length() - 2; i++) {
            String ss = s.substring(i, i + k);
            if(smallest.compareTo(ss) > 0){
                smallest = ss;
            }
            if(largest.compareTo(ss) < 0){
                largest = ss;
            }
        }
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}