

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C74id12763 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 15, 21, 6, 8, 33, 54, 23, 3, 22, 16 };
        List<Integer> arrPares = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arrPares.add(arr[i]);
            }
        }
        for (Integer elemento : arrPares) {
            System.out.println(elemento);
        }
    }
}