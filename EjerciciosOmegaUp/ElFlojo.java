import java.util.Scanner;

public class ElFlojo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        sc.close();
        if(nombre.length() > 4){
            System.out.printf("%s%d%s", nombre.charAt(0), nombre.length() - 2 ,nombre.charAt(nombre.length()-1));
        }else{
            System.out.println(nombre);
        }
        
    }
}
