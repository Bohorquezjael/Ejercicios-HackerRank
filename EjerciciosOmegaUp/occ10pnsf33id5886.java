import java.util.Scanner;

public class occ10pnsf33id5886 {
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String llave = sc.nextLine();
        String cerradura = sc.nextLine();
        sc.close();
        boolean flag = true;

        for(int i = 0; i < llave.length(); i++){
            if(llave.charAt(i) == cerradura.charAt(i)){
                flag = false;
                break;
            }
        }
        System.out.println(flag ? "SI" : "NO");
    }
}
