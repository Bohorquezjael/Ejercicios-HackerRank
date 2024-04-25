import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PivoteReloaded4106 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String nums[] = br.readLine().split(" ");
        int pivot = Integer.parseInt(br.readLine());
        Arrays.stream(nums).filter(num -> Integer.parseInt(num) < pivot).forEach(t -> System.out.print(t + " "));
        System.out.println();
        Arrays.stream(nums).filter(num -> Integer.parseInt(num) > pivot).forEach(t -> System.out.print(t + " "));
    }
}
