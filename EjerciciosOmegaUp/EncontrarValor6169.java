import java.util.Scanner;

public class EncontrarValor6169 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int valor = sc.nextInt();
        boolean flag = false;
        for(int i = 0; i < n; i++){
            if(valor == arr[i]){
                flag = true;
                System.out.println(i);
                break;
            }
        }
        System.out.print(flag ? "" : "NO");
    }
}