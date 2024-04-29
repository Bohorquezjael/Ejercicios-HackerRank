import java.io.*;
import java.util.ArrayList;
import java.util.List;


class Result {

    public static void plusMinus(List<Integer> arr) {
        double a = 0, b = 0, c = 0;
        for(Integer p : arr){
            if(p > 0)a += 1.0;
            else if(p < 0)b += 1.0;
            else c += 1.0;
        }
        System.out.printf("%06f\n", a / arr.size());
        System.out.printf("%06f\n", b / arr.size());
        System.out.printf("%06f\n", c / arr.size());
    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
