import java.util.Scanner;

public class AnioBicioso17294 {
    public static void main(String[] args) {
        //! error de omega??
        Scanner sc = new Scanner(System.in);
        int mes = sc.nextInt(), anio = sc.nextInt();
        if (VerificaDatos(mes, anio)) {
            ImprimeMes(mes);
            VerificaDiasBisiesto(mes, anio);
        }
    }

    private static void VerificaDiasBisiesto(int mes, int anio) {
        if(mes == 2){
            System.out.println((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0) ? "29 dias" : "28 dias");
        }else{
            if((mes % 2 != 0) || mes == 8 || mes == 10 || mes == 12){
                System.out.println("31 dias");
            }else{
                System.out.println("30 dias");
            }
        }
    }

    private static void ImprimeMes(int mes) {
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        System.out.println(meses[mes - 1]);
    }

    private static boolean VerificaDatos(int mes, int anio) {
        boolean flagMes = false, flagAnio = false;
        if (mes >= 1 && mes <= 12) {
            flagMes = true;
        }
        if (anio > 999 && anio <= 9999) {
            flagAnio = true;
        }

        if (!flagAnio && !flagMes) {
            System.out.println("Ambos datos son incorrectos");
        } else if (!flagAnio) {
            System.out.println("Error en el año");
        } else if (!flagMes) {
            System.out.println("Error en el mes");
        }

        return flagAnio && flagMes;
    }
}
