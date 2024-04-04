import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.math.BigInteger;

public class GenerarUnVectorConLosPrimerosNumerosPrimos8889 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()), i = 2;
        version2(n, i);

        // BigInteger k = BigInteger.valueOf(i);
        // ArrayList<Integer> nums = new ArrayList<>();
        // while (nums.size() < n) {
        // if (k.isProbablePrime(10)) {
        // nums.add(i);
        // }
        // i++;
        // k = BigInteger.valueOf(i);
        // }
        // for (int j : nums) {
        // System.out.print(j + " ");
        // }
    }

    public static void version2(int n, int i) {
        int j = i;
        while (n > 0) {
            if (isPrime(j)) {
                System.out.print(j + " ");
                n--;
            }
            j++;
        }
    }

    public static boolean isPrime(int n) {
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}