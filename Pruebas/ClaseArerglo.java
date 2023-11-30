package Pruebas;

public class ClaseArerglo {
    public static void main(String[] args) {
        Ejemplo llamarEjemplo = new Ejemplo();
        String ArregloX[]=llamarEjemplo.getNombres();
      for (String iterable_element : ArregloX) {
        System.out.println(iterable_element);
      }
    }
}
