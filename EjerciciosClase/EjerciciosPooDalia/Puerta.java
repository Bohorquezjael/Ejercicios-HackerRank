package EjerciciosPooDalia;

public class Puerta {
    private boolean estado;

    public Puerta(boolean e){
        estado = e;
    }

    public Puerta() {}

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    } 
}