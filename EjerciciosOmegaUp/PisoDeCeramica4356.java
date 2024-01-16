

import java.util.Scanner;

public class PisoDeCeramica4356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largo = sc.nextInt(), ceraBlanca, ceraGris;
        ceraBlanca = (largo * largo) - (((largo - 2) * 2) - 1) - ((largo * 4) - 4);
        ceraGris = (largo * largo) - ceraBlanca;
        System.out.println(ceraBlanca + " " + ceraGris);
    }
}