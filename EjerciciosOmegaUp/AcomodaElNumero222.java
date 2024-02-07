import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AcomodaElNumero222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), tmp;
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++){
            nums.add(sc.nextInt());
        }
        tmp = nums.get(0);
        Collections.sort(nums);
        System.out.println(nums.indexOf(tmp));
    }
}
