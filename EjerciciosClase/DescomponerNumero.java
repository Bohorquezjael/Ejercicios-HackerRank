public class DescomponerNumero {

    //! como ya sabemos que las posiciones de los numeros no cambian es decir ya estan definidos usaremos el indice de su posicion 
public static void main(String[] args) {
    String number = "1987";
    int large = number.length();

    switch (large){
        case 1:
        System.out.println(number.charAt(0) + " unidades");
        break;

        case 2:
        System.out.println(number.charAt(0) + " decenas");
        System.out.println(number.charAt(1) + " unidades");
        break;

        case 3: 
        System.out.println(number.charAt(0) + " centenas");
        System.out.println(number.charAt(1) + " decenas");
        System.out.println(number.charAt(2) + " unidades");
        break;

        case 4:
        System.out.println(number.charAt(0) + " unidades de millar");
        System.out.println(number.charAt(1) + " centenas");
        System.out.println(number.charAt(2) + " decenas");
        System.out.println(number.charAt(3) + " unidades");
        break;
    }
    }
}