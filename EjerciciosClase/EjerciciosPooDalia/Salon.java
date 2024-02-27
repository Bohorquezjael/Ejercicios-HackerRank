package EjerciciosPooDalia;

public class Salon{ 
    private String nombre;
    Puerta puerta;
    Foco foco;
    
    public Salon(boolean ep, boolean ef){
        puerta = new Puerta(ep);
        foco = new Foco(ef);
    }

    public Salon(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}