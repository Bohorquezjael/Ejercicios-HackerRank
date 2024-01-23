import java.util.Scanner;

public class PasswordJava15583 {
    //! error de omega??
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();

        if(pass.length() >= 12){
            boolean flag = false;
            for(int i = 1; i < pass.length(); i++){
                if(pass.charAt(i) == pass.charAt(i - 1)){
                    flag = true;
                }
            }

            boolean contieneVocal = pass.toLowerCase().chars().anyMatch(c -> "aeiou".indexOf(c) != -1);
            boolean contieneNumero = pass.toLowerCase().chars().anyMatch(c -> "1234567890".indexOf(c) != -1);

            if(!flag && contieneNumero && contieneVocal){
                System.out.println("Seguro");
            }else{
                System.out.println("Inseguro");
            }

        }else{
            System.out.println("Inseguro");
        }
    }
}
