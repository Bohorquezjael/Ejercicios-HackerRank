import java.util.Scanner;

public class ConversionDeBases19343 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), base = sc.nextInt();
        String number = "";
        while (n != 0) {
            number += String.valueOf(n % base);
            n /= base;
        }
        System.out.println(new StringBuilder(number).reverse());
    }
}