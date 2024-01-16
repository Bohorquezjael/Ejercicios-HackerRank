


/*Escribir un programa que simule un cajero automático.

El saldo disponible de la cuenta siempre empieza en $1000.

El usuario tiene tres opciones. Para hacer un retiro, el usuario ingresa el carácter 'R', seguido del monto a retirar.

Para hacer un deposito, el usuario ingresa el carácter 'D', seguido del monto a depositar. Para consultar su saldo, el usuario ingresa el carácter 'C', en este caso, el cajero debe imprimir en pantalla el saldo disponible, con el prefijo '$'. Finalmente, para salir y terminar de usar el cajero, el usuario ingresa el carácter 'S'.

MUY IMPORTANTE: El programa debe estar estructurado en modulos, no todo en la funcion principal. */

import java.util.Scanner;

public class SimuladorDeCajeroAutomatico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta cuenta = new Cuenta(1000);
        char opcion;
        do{
            opcion = sc.next().charAt(0);
            int monto;
            switch (opcion) {
                case 'C' :
                System.out.printf("$%d\n", cuenta.getSaldo());
                break;

                case 'D' :
                monto = sc.nextInt();
                cuenta.DepositaSaldo(monto);
                break;

                case 'R':
                monto = sc.nextInt();
                cuenta.RetiraSaldo(monto);
                break;
            }
        }while(opcion != 'S');
    }

    public static class Cuenta {
        private int saldo;

        public Cuenta(int valorInicial) {
            this.saldo = valorInicial;
        }

        public int getSaldo() {
            return saldo;
        }

        public int RetiraSaldo(int montoDeRetiro) {
            return this.saldo -= montoDeRetiro;
        }

        public int DepositaSaldo(int montoDeposito) {
            return this.saldo += montoDeposito;
        }
    }
}