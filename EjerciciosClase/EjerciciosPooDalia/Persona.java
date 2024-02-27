package EjerciciosPooDalia;

public class Persona {
    private String nombre;
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void abrirPuerta(Salon salon){
        if(!salon.puerta.getEstado()){
            salon.puerta.setEstado(true);
        }else{
            System.out.println("Error la puerta ya se encuentra abierta");
        }
    }

    public void cerrarPuerta(Salon salon){
        if(salon.puerta.getEstado()){
            salon.puerta.setEstado(false);
        }else{
            System.out.println("Error la puerta ya se encuentra cerrada");
        }
    }
    
    public void encenderFoco(Salon salon){
        if(!salon.foco.getEstado()){
            salon.foco.setEstado(true);
        }else{
            System.out.println("Error el foco ya se encuentra encendido");
        }
    }

    public void apagarFoco(Salon salon){
        if(salon.foco.getEstado()){
            salon.foco.setEstado(false);
        }else{
            System.out.println("Error el foco ya se encuentra apagado");
        }
    }
}