import java.util.Scanner;

public class PrefijosDePalabrasDeDiccionarios1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nPals = sc.nextInt();
        if (nPals != 0) {
            sc.nextLine();
            String pals[] = new String[nPals];
            for (int i = 0; i < nPals; i++) {
                pals[i] = sc.nextLine();
            }
            int nDicci = sc.nextInt();
            if (nDicci != 0) {
                sc.nextLine();
                String dicci[] = new String[nDicci];
                for (int i = 0; i < dicci.length; i++) {
                    dicci[i] = sc.nextLine();
                }

                for (int i = 0; i < dicci.length; i++) {
                    int suma = 0;
                    for (int j = 0; j < pals.length; j++) {
                        suma += pals[j].startsWith(dicci[i]) ? 1 : 0;
                    }
                    System.out.print(suma + " ");
                }
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }
    }
}
