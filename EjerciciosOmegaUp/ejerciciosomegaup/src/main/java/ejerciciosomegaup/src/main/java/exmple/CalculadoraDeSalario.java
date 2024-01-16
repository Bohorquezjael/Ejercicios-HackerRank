package ejerciciosomegaup.src.main.java.exmple;

/*Escriba un programa que reciba el numero de horas de trabajo 'x' y el sueldo 'y' por hora de un empleado. El programa debe calcular e imprimir el sueldo de empleado para esa semana. El trabajador recibe su sueldo (salario mínimo) normal por las primeras 40 horas; 1.5 veces su sueldo (una vez y media) por cada vez después de las primeras 40 (pero no más de 50); y 2 veces su sueldo normal (tiempo extra doble) por cada hora en exceso de 50 horas. */


import java.util.Scanner;
//FIXME
public class CalculadoraDeSalario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        CalcularHoras(x, y);
        sc.close();
    }

    public static void CalcularHoras(int x, double y) {
        double horasExtra = 0, horasMitad = 0, horasNormal = 0;
        if (x > 50) {
            horasExtra = x - 50;
            horasMitad = 10;
            horasNormal = 40;
        } else if (x > 40 && x <= 50) {
            horasMitad = x - 40;
            horasNormal = 40;
        } else {
            horasNormal = x;
        }
        CalcularSalarioPorHoras(horasExtra, horasMitad, horasNormal, y);
    }

    public static void CalcularSalarioPorHoras(double hE, double hM, double hN, double y) {
        double precioHrExtra = y * 2, precioHrMed = y * 1.5, precioHrNor = y;

        double total = (precioHrExtra * hE) + (precioHrMed * hM) + (precioHrNor * hN);

        System.out.println(total);
    }

}
