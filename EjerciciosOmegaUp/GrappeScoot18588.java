import java.util.Scanner;

public class GrappeScoot18588{
    //FIXME
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int siglo = (num % 100 == 0) ? (num / 100) : (num / 100 + 1);
        if((num % 4 == 0 && num % 100 != 0) || num % 400 == 0){
            System.out.printf("%d es un año bisiesto, y su siglo es el %d", num, siglo);
        }else{
            System.out.printf("%d no es un año bisiesto, pero su siglo es el %d", num, siglo);
        }
    }
}