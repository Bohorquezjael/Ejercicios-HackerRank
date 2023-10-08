package EjerciciosOmegaUp;

import java.util.Scanner;
//FIXME
public class AyudaAUnaTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double values[] = new double[10];
        for(int i = 0; i < values.length; i++){
            values[i] = sc.nextDouble();

            if(values[i] >= 500 && values[i] <= 1000){
                values[i] *= .95;
            }else if(values[i] >= 1001 && values[i] <= 7000){
                values[i] *= .89;
            }else if(values[i] >= 7001 && values[i] <= 15000){
                values[i] *= .82;
            }else if(values[i] > 15000){
                values[i] *= .75;
            }
        }

        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }
        sc.close();
    }
}
