

import java.util.Scanner;

public class AyudandoAUnaDoctora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            char operacion = sc.next().charAt(0);
            if(operacion == 'A'){
                double peso = sc.nextDouble(), altura = sc.nextDouble();
                double imc = peso / Math.pow(altura, 2);
                String decimales = Double.toString(imc % (int)imc);
                if((decimales.length() > 4 && decimales.charAt(4) != '0') || (decimales.charAt(3) == '0')){
                    System.out.printf("%.1f\n", imc);
                }else{
                    System.out.printf("%.2f\n", imc);
                }
            }else{
                char sexo = sc.next().charAt(0);
                double peso = sc.nextDouble(), altura = sc.nextDouble();
                int edad = sc.nextInt();
                double tmb = (10 * peso) + (6.25 * altura) - (5 * edad);
                tmb = sexo == 'H' ? tmb + 5  : tmb - 161;
                String decimales = Double.toString(tmb % (int)tmb);

                if((decimales.length() > 4 && decimales.charAt(4) != '0') || (decimales.length() == 4 && decimales.charAt(3) == '0') || (decimales.length() == 3)){
                    System.out.printf("%.1f\n", tmb);
                }else{
                    System.out.printf("%.2f\n", tmb);
                }
            }
        }
    }
}
