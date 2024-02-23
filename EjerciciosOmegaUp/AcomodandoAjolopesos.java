import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class AcomodandoAjolopesos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Double> ajolotes = new ArrayList<>(n);
        sc.nextLine();
        HashMap<String, Integer> arr = new HashMap<>(n);
        arr.put("0.50", 0);
        arr.put("1", 0);
        arr.put("2", 0);
        arr.put("5", 0);
        arr.put("10", 0);
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            if(arr.containsKey(s)){
            arr.put(s, arr.get(s) + 1);
        }
        }
        for(String key : arr.keySet()){
            for(int i = 0; i < arr.get(key); i++){
                ajolotes.add(Double.parseDouble(key));
            }
        }
        Collections.sort(ajolotes);
        for (int i = ajolotes.size() - 1; i >= 0; i--){
            if(ajolotes.get(i) < 1){
                System.out.printf("%.2f ", ajolotes.get(i));
            }else{
                System.out.printf("%.0f ", ajolotes.get(i));
            }
        }
        // double arr[] = new double[n];
        // for (int i = 0; i < n; i++) {
        //     arr[i] = sc.nextDouble();
        // }
        // Arrays.sort(arr);
        // for (int i = n - 1; i >= 0; i--) {
        //     if (arr[i] == 0.50) {
        //         System.out.printf("%.2f", arr[i]);
        //     } else if (arr[i] == 1 || arr[i] == 2 || arr[i] == 5 || arr[i] == 10) {
        //         System.out.print((int) arr[i] + " ");
        //     }
        // }
    }
}