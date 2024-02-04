import java.util.Scanner;

public class SumaDeRangos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), iterator = 1, suma = 0;
        int nums[] = new int[n * 2 - 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1 <= n ? (i + 1) : (n - (i + 1 - n)); 
        }
        while (iterator < n){
            for (int i = iterator - 1; i < n + iterator; i++) {
                suma += nums[i];
            }
            iterator++;
        }
        System.out.println(suma);
    }
}

//(n * (n+1) / 2) + n- 1