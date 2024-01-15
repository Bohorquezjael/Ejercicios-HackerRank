package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;

public class AKungaLeGustaSumar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        while(sc.hasNextLine()){
        Long n = Long.parseLong(sc.nextLine());
        if(n > 0){
           System.out.println(n * (n + 1) / 2);
        }
        }
    }catch(Exception e){

    }
        sc.close();
    }
}
