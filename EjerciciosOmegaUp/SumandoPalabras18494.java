import java.util.Scanner;

public class SumandoPalabras18494 {
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), suma = 0;
        sc.nextLine();
        for(int i = 0; i < n; i++){
            String str = sc.nextLine();
            int sumaCaracter = 0;
            System.out.print(str + " ");
            for (char c : str.toCharArray()) {
                sumaCaracter += (int)c;
            }
            System.out.print(sumaCaracter + "\n");
            suma += sumaCaracter;
        }
        System.out.println(suma);
    }
}
