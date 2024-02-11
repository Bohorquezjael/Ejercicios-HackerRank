import java.util.Scanner;

public class ConversionDeBases19343 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), base = sc.nextInt();
        String number = "";
        while (n != 0) {
            if(n % base < 10){
            number += String.valueOf(n % base);
            }else{
                number += (char)(55 + n % base);
            }
            n /= base;
        }
        System.out.println(new StringBuilder(number).reverse());
    }
}