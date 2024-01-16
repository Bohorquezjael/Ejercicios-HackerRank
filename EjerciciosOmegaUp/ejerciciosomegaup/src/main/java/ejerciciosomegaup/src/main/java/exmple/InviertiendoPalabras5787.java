package ejerciciosomegaup.src.main.java.exmple;

import java.util.Scanner;

public class InviertiendoPalabras5787 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line[] = sc.nextLine().split(",");
        sc.close();
        StringBuilder finalWord = new StringBuilder();
        for (String word : line) {
            finalWord.append(new StringBuilder(word).reverse());
            if (!word.equals(line[line.length - 1])){
            finalWord.append(",");
            }
        }
        System.out.println(finalWord.toString());
    }
}
