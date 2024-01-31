import java.util.Scanner;

public class D4P4Password17953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        String pal = sc.nextLine();
        boolean flag = true;
        if(pal.length() > 11){
            flag = verificaRepetidos(pal) && verificaVocales(pal) && verificaNumeros(pal);
            System.out.println(flag ? "SEGURO" : "INSEGURO");
        }else{
            System.out.println("INSEGURO");
        }
    }

    private static boolean verificaNumeros(String pal) {
        return pal.toLowerCase().chars().anyMatch(c -> "1234567890".indexOf(c) != -1);
    }

    private static boolean verificaVocales(String pal) {
        return pal.toLowerCase().chars().anyMatch(c -> "aeiou".indexOf(c) != -1);
    }

    private static boolean verificaRepetidos(String pal) {
        boolean flag = true;
        for(int i = 0; i < pal.length() - 1 && flag; i++){
            flag = !(pal.charAt(i) == pal.charAt(i + 1));
        }
        return flag;
    }
}
