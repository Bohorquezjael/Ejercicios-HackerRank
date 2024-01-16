package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class Pares {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long values[] = new Long[n];
        boolean flag = false;
        for (int i = 0; i < values.length; i++) {
            values[i] = sc.nextLong();
            if (values[i] % 2 == 0) {
                flag = true;
            }
        }if (flag) {
            for (int j = 0; j < values.length; j++) {
                if (values[j] % 2 == 0){
                System.out.printf("[%d] ", values[j]);
                }
            }
        }else{
            System.out.println(":(");
        }
        sc.close();
    }
}