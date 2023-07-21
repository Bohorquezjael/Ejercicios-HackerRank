
//import java.io.*;
import java.util.*;

public class DatosPrimitivos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iterator = sc.nextInt();
        for (int i = 0; i < iterator; i++) {
            // *es mejor cambiarlo directamente por un long dentro del try y manejarlo como "exception" y consumir el valor mediante "sc.next();" para usar ese valor en el bloque catch 
            String numero = sc.next();
            try {//maneja la excepción cuando el valor es mas grande que el tipo long
                long prueba = Long.parseLong(numero); 
                //prueba a hacer la conversion en caso de una excepción saltara al bloque catch
                dataTypes(prueba);
            } catch (NumberFormatException ex) {
                System.out.println(numero + " can´t be fitted anywhere.");
            }

        }
        sc.close();
    }
        //* se puede mejorar usando los valores mínimos y máximos de cada tipo de dato */
    public static void dataTypes(Long numero) {
        String b = "byte", s = "short", i = "int", l = "long";
        if (numero >= -128 && numero <= 127) {
            System.out.println(numero + " can be fitted in:");
            System.out.println("* " + b + "\n* " + s + "\n* " + i + "\n* " + l);
        } else if (numero >= -32768 && numero <= 32767) {
            System.out.println(numero + " can be fitted in:");
            System.out.println("* " + s + "\n* " + i + "\n* " + l);
        } else if (numero >= -2147483648 && numero <= 2147483647) {
            System.out.println(numero + " can be fitted in:");
            System.out.println("* " + i + "\n* " + l);
        } else {
            System.out.println(numero + " can be fitted in:");
            System.out.println("* " + l);
        }
    }

}
