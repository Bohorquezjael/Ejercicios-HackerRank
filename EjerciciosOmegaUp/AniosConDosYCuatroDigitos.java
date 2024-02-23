import java.util.Scanner;

public class AniosConDosYCuatroDigitos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        String date[] = sc.nextLine().split("/");
        int anio = Integer.parseInt(date[2]);
        date[2] =  anio >= 74 ? "19" + anio : "20" + anio;
        System.out.println(date[0]+ "/" + date[1] + "/" + date[2]);
        }
    }
}
