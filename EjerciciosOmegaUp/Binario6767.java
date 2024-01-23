import java.util.Scanner;

public class Binario6767 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String bin = "";
        while(number != 1){
            bin += (number % 2) + " ";
            number /= 2;
        }
        System.out.print(number);
        System.out.println(new StringBuilder(bin).reverse());
    }
}