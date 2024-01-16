package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class AyudaAUnaTienda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //! tomar en cuenta si se deben hacer operaciones "complejas" o sencillas y no guardarlos a menos de ser necesario pd.no es necesario imprimirlos al finalizar la entrada puede ser despues de cada uno
        //! si no hay numero numero definido de elementos no asumirlo y usar ciclos o metodos dependiendo el tipo de dato
        try {
            while (sc.hasNextLine()) {
                double valorLeido = Double.parseDouble(sc.nextLine());
                if (valorLeido < 500) {
                    //posibles mejoras codigo repetitivo
                    System.out.printf("%.2f %n", valorLeido);
                } else if (valorLeido >= 500 && valorLeido <= 1000) {
                    System.out.printf("%.2f %n", valorLeido *= .95);
                } else if (valorLeido >= 1001 && valorLeido <= 7000) {
                    System.out.printf("%.2f %n", valorLeido *= .89);
                } else if (valorLeido >= 7001 && valorLeido <= 15000) {
                    System.out.printf("%.2f %n", valorLeido *= .82);
                } else if (valorLeido > 15000) {
                    System.out.printf("%.2f %n", valorLeido *= .75);
                }
            }
        } catch (NumberFormatException e) {

        }
        sc.close();
    }
}
