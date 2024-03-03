import java.util.Scanner;

public class PromedioAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }
        sc.close();
        if((sum / n) - (int)(sum / n) == 0.0){
            System.out.println((int)sum / n);
        }else{
            System.out.printf("%.1f", sum / n);
        }
    }
}
