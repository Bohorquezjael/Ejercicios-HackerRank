

import java.util.Scanner;

public class EjercicioCase2{
	
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	int numeroMes;

	do{
	System.out.println("Ingresa un numero entre 1 y 12");
	numeroMes = sc.nextInt();
	}while(numeroMes < 1 || numeroMes > 12);
   sc.close();

	switch(numeroMes){

		case 1, 2, 3 :
            System.out.println("La mayor parte del tiempo es Invierno");
            break;
            
            case 4, 5, 6:
            System.out.println("La mayor parte del tiempo es Primavera");
            break;

            case 7, 8, 9: 
            System.out.println("La mayor parte del tiempo es Verano");
            break;

            case 10, 11, 12:
            System.out.println("La mayor parte del tiempo es Otoño");
            break;
	}

	
   }

}