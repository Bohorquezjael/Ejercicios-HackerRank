import java.util.Scanner;
//FIXME
public class occ10pnsf21id5879 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pal = sc.nextLine();
        int numeros = 0, letras = 0;
        for (char c : pal.toCharArray()) {
            if(Character.isLetter(c)){
                letras++;
            }else{
                numeros++;
            }
        }

        System.out.println(letras + " " + numeros);
    }
}
