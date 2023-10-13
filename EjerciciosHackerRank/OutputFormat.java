
import java.util.Scanner;

public class OutputFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int j = 1;
        int i1 = 0;
        String s1 = "";
        for (int i = 1; i <= 32; i++){
            System.out.print("=");
        }
        while(j <= 3){
        s1 = sc.next();
        i1 = sc.nextInt();
        System.out.printf("\n%-15s %03d", s1, i1);
        }

        for (int i = 1; i <= 32; i++){
            System.out.print("=");
        }
        sc.close();
    }

    /*
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int i1 = sc.nextInt();
        String s2 = sc.next();
        int i2 = sc.nextInt();
        String s3 = sc.next();
        int i3 = sc.nextInt();
        for (int i = 1; i <= 32; i++){
            System.out.print("=");
        }
        System.out.printf("\n%-14s %03d \n", s1, i1);
        System.out.printf("%-14s %03d \n", s2, i2);
        System.out.printf("%-14s %03d \n", s3, i3);

        for (int i = 1; i <= 32; i++){
            System.out.print("=");
        }
     */
}
