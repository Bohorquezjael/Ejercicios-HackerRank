import java.util.Scanner;

public class PromedioMaterias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el numero de calificaciones por materia: ");
        int nCalifPorMateria=sc.nextInt();
        System.out.println("Ingresa el numero de materias: ");
        int nmaterias = sc.nextInt();
        double promedios [][] = new double[nCalifPorMateria][nmaterias];
        double finalMaterias = 0;
        for(int i = 0; i < nmaterias; i++){

            double promedioFinalMateria = 0;
            for(int j = 0 ;j < nCalifPorMateria; j++){
            System.out.println("Ingresa la calificacion " + (i+1) + "." + (j+1));
            double calificacion = sc.nextDouble();
            promedioFinalMateria += calificacion;
            promedios[j][i] = calificacion;
            
            }
            finalMaterias += (promedioFinalMateria /= nCalifPorMateria);
        }
        sc.close();
        System.out.println("El promedio final es: " + (finalMaterias/nmaterias));
    }
}
