import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InvertirPalabra{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        String pal = br.readLine();
        for (int i = pal.length()-1; i >= 0; i--) {
            System.out.print(pal.charAt(i));
        }
    }
}