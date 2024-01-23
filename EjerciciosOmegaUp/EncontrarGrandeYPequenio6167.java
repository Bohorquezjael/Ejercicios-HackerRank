import java.util.Scanner;

public class EncontrarGrandeYPequenio6167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();
        int numeros[] = new int[tamanio], mayor = 0, menor = Integer.MAX_VALUE, tmp;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            mayor = numeros[i] > mayor ? numeros[i] : mayor;
            menor = numeros[i] < menor ? numeros[i] : menor;
        }
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] == mayor){
                tmp = numeros[0];
                numeros[i] = tmp;
                numeros[0] = mayor;
            }else if(numeros[i] == menor){
                tmp = numeros[numeros.length - 1];
                numeros[i] = tmp;
                numeros[numeros.length - 1] = menor;
            }
        }

        for (int i : numeros) {
            System.out.println(i);
        }
    }    
}
