

import java.util.Scanner;
public class SeleccionDeEstudiantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numberA = sc.nextLine(), numberB = sc.nextLine();
        int a = Character.getNumericValue(numberA.charAt(numberA.length()-1)), b = Character.getNumericValue(numberB.charAt(numberB.length()-1));
        System.out.println((a * b) % 10);
    }
}
