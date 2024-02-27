package EjerciciosPooDalia;

public class prueba {

    public static void main(String args[]) {

        Persona p = new Persona();
        Salon s = new Salon(true, false);
        p.abrirPuerta(s);
        p.encenderFoco(s);
    }
}
