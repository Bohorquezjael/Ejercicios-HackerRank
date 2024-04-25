import java.util.Scanner;

public class ElReyGnomo6925 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tam, tmp, num;
        for(int i = 0; i < n; i++){
            tam = sc.nextInt();
            num = sc.nextInt();
            for(int j = 1; j < tam; j++){
                tmp = sc.nextInt();
                if(tmp != num + 1 && j > 0){
                    sc.nextLine();
                    System.out.println(j + 1);
                    break;
                }
                num = tmp;
            }
        }
    }
}
