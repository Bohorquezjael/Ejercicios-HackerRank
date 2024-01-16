

import java.util.Scanner;

public class SecuenciaCreciente2651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comparator, contador = 0, contadorMayor = 0;
        String numbers[] = sc.nextLine().split(" ");
        comparator = Integer.valueOf(numbers[0]);
        for(int i = 0; i < numbers.length; i++){
            if(Integer.valueOf(numbers[i]) > comparator){
                contador++;
                contadorMayor = (contador > contadorMayor) ? contador : contadorMayor;
            }else{
                contador = 1;
            }
            comparator = Integer.valueOf(numbers[i]);
        }
        System.out.println(contadorMayor);
    }
}
