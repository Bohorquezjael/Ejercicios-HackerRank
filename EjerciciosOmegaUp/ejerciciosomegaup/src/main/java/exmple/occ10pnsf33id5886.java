package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class occ10pnsf33id5886 {
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String llave = sc.nextLine();
        String cerradura = sc.nextLine();
        sc.close();
        boolean flag = true;
        int i = 0;
        while(i < llave.length() && flag){
            if(llave.charAt(i) == cerradura.charAt(i)){
                flag = false;
            }
            i++;
        }
        System.out.println(flag ? "SI" : "NO");
    }
}
