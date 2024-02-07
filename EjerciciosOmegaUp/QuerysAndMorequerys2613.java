import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//!FIXME
public class QuerysAndMorequerys2613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            System.out.println(nums.stream().filter(nu -> nu.equals(x)).count());
        }
    }
}
