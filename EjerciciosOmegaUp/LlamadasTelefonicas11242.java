import java.util.Scanner;

public class LlamadasTelefonicas11242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        String s[] = sc.nextLine().split(",");
        double costo;
        switch (s[0]) {
            case "12":
                costo = Double.parseDouble(s[1]) * 2;
                if(costo == (int)costo){
                    System.out.printf("%.0f\n", costo);
                }else{
                    System.out.printf("%.1f\n", costo);
                }
                break;
            case "15":
                costo = Double.parseDouble(s[1]) * 2.2;
                if(costo == (int)costo){
                    System.out.printf("%.0f\n", costo);
                }else{
                    System.out.printf("%.1f\n", costo);
                }
                break;
            case "18":
                costo = Double.parseDouble(s[1]) * 4.5;
                if(costo == (int)costo){
                    System.out.printf("%.0f\n", costo);
                }else{
                    System.out.printf("%.1f\n", costo);
                }
                break;
            case "19":
                costo = Double.parseDouble(s[1]) * 3.5;
                if(costo == (int)costo){
                    System.out.printf("%.0f\n", costo);
                }else{
                    System.out.printf("%.1f\n", costo);
                }
                break;
            case "23", "25":
                costo = Double.parseDouble(s[1]) * 6;
                if(costo == (int)costo){
                    System.out.printf("%.0f\n", costo);
                }else{
                    System.out.printf("%.1f\n", costo);
                }
                break;
            case "29":
                costo = Double.parseDouble(s[1]) * 5;
                if(costo == (int)costo){
                    System.out.printf("%.0f\n", costo);
                }else{
                    System.out.printf("%.1f\n", costo);
                }
                break;
        }
    }
    }
}
