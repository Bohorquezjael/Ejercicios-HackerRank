import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

// class Result {

    

// }

public class MiniMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        miniMaxSum(arr);

        bufferedReader.close();
    }
    public static void miniMaxSum(List<Integer> arr) {
        List<Integer> nums = arr;
        Collections.sort(nums);
        long menor = 0, mayor = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            menor += nums.get(i);
        }
        
        for (int i = nums.size() - 1; i >= 1; i--) {
            mayor += nums.get(i);
        }
        System.out.println(menor + " " + mayor);
    }
}
