import java.util.ArrayList;
import java.util.Scanner;

public class SumaDeMultiplicacionDePares8318 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, n = sc.nextInt();
        // ArrayList<Integer> nums = new ArrayList<>();
        int nums[] = new int[n];
        for(int i = 0; i < n; i++){
            // nums.add(sc.nextInt());
            nums[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++){
                for(int j = i + 1; j < n; j++){
                // sum += nums.get(i) * nums.get(j);
                sum += nums[i] * nums[j];
            }
        }
        System.out.println(sum);
    }
}
