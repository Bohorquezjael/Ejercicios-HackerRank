package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class ImprimiendoArreglos1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int large = sc.nextInt();
        int numbers[] = new int[large];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        for(int j = 0; j < numbers.length; j++){
            System.out.println(numbers[j]);
        }
        sc.close();
    }
}
