import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CodigoIan {
    static Queue<String> colaAlumno = new LinkedList<>();
    static Queue<String> colaTrabajador = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String datos, datos2;
        int n = sc.nextInt(), primerDato, segundoDato;
        sc.nextLine();
        int swap = 1;
        while(n-- > 0){
            datos = sc.nextLine();
            primerDato = datos.indexOf(' ');
            segundoDato = datos.indexOf(' ', primerDato + 1);
            if(!datos.equals("ATIENDE")){
                datos2 = datos.substring(0, segundoDato);
            }else{
                datos2 = datos;
            }
            switch (datos2) {
                case "LLEGA TRABAJADOR":
                    colaTrabajador.add(datos.substring(segundoDato + 1));
                    break;
                case "LLEGA ALUMNO":
                colaAlumno.add(datos.substring(segundoDato + 1));
                    break;
                case "ATIENDE":
                 //impar para trabajador par para alumno
                    if (!estaVacia()) {
                        polQueue(swap);
                    } else{
                        pollAlumno();
                    }
                    swap++;
                    break;
            }
        }
}

    private static void polQueue(int swap) {
        if(swap % 2 == 0){
            pollAlumno();
        }else{
            pollTrabajador();
        }
    }

    public static boolean estaVacia() {
        return colaTrabajador.isEmpty();// se simplifica el codigo, mala practica hacer varios return en un mismo metodo ademas el metodo es redundante ya que se puede hacer directamente en el if
    }

    public static void pollAlumno() {
        System.out.println(colaAlumno.poll());
    }

    public static void pollTrabajador() {
        System.out.println(colaTrabajador.poll());
    }
}