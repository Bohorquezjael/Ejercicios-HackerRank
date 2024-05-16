public class Animal {
    // public String nombre;
    // public String raza;
    // public boolean sexo;
    // public short edad;
    // public String color;
    private String nombre;
    private String raza;
    private boolean sexo;
    private short edad;
    private String color;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(String nombre, String raza, boolean sexo, short edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.color = color;
    }

    public Animal(){}

    public Animal(String raza, boolean sexo, short edad, String color){
        this.raza = raza;
        this.sexo = sexo;
        this.edad = edad;
        this.color = color;
    }

    @Override
    public String toString() { 
        StringBuilder string = new StringBuilder();
        string.append("Animal{\n nombre =" + nombre + "\n raza = " + raza + "\n sexo = ");
        string.append(sexo ? "Macho" : "Hembra");
        string.append("\n edad = " + edad + "\n color = " + color + "\n}");
                return string.toString();
    }
}


class cliente{
    public static void main(String[] args) {
        Animal animal = new Animal("Firulais", "Pastor Aleman", true, (short)5, "Cafe");

        Animal animal2 = new Animal();
        animal2.setNombre("Firulais");
        Animal animal3 = new Animal("Gato siames", false, (short)3, "Blanco");
    }

}
