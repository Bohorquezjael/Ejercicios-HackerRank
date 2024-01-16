

import java.util.Scanner;
public class ContandoOvejas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int nAnimales = sc.nextInt();
            int conta = 0;
            sc.nextLine();
            for (int j = 0; j < nAnimales; j++) {
                String animal = sc.nextLine();
                if (animal.equals("oveja")){
                    conta++;
                }
            }
            System.out.println(conta);
        }
        sc.close();
    }
}
