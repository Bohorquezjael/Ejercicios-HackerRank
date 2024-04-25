import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumandoPrimos12049 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int suma = 0, contador = 0;
        for (int i = 1; i <= n; i++) {
            if(BigInteger.valueOf(i).isProbablePrime(i)){
                suma += i;
                contador++;
            }
        }
        System.out.println(contador + " " + suma);
    }
}
