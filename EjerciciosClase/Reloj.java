public class Reloj {
    private byte segundos;
    private byte minutos;
    private byte horas;

    // public Reloj(){
    //     iniciarReloj();
    // }{}

    public String iniciarReloj() {
        contarSegundos();
        return toString();
    }

    private void contarSegundos() {
        if(this.segundos < 59){
            this.segundos += 1;
        }else{
            this.segundos = 0;
            contarMinutos();
        }
    }

    private void contarMinutos() {
        if(this.minutos < 59){
            this.minutos += 1;
        }else{
            contarHoras();
            this.minutos = 0;
        }
    }

    private void contarHoras() {
        if(this.horas < 23){
            this.horas += 1;
        }else{
            reiniciaReloj();
        }
    }

    private void reiniciaReloj() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    public String toString24(){
        return  "Hora: "+ horas +":"+ minutos +":"+ segundos;
    }

    public String toString12(){
        return this.horas > 12 ? "Hora: "+ (horas - 12) +":"+ minutos +":"+ segundos : "Hora: "+ horas +":"+ minutos +":"+ segundos;
    }
    
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        System.out.println(reloj.toString24());
        for(int i = 0; i <= 86398; i++){
            reloj.iniciarReloj();
        }
        System.out.println(reloj.toString24());
    }
}
