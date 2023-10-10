package EjerciciosOmegaUp;

// import java.util.ArrayList;
// import java.util.List;
import java.util.Scanner;

public class CuantosInstructoresHay {
    public static void main(String[] args) {
        //! Aun no es tan eficiente como esperaria pero es mejor que el arraylist toma 13s y 1.31MB
        Scanner sc = new Scanner(System.in);
        String lista = sc.nextLine();
        String nombresSeparados[] = lista.split(" ");
        System.out.println(nombresSeparados.length);
        sc.close();





        //! forma "ineficiente" con arraylist toma alrededor de 16s y 1.37MB
        // Scanner sc = new Scanner(System.in);
        // String lista = sc.nextLine();
        // Scanner nombre = new Scanner(lista);
        // List<String> nombres = new ArrayList<>();

        // while(nombre.hasNext()){
        //     nombres.add(nombre.next());
        // }

        // System.out.println(nombres.size());

        // sc.close();
        // nombre.close();
    }
}
