import java.util.Scanner;
//FIXME
public class TresLadosDeTriangulo10289 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        String arr[] = sc.nextLine().split(", ");
        double s =  (Double.parseDouble(arr[0])  + Double.parseDouble(arr[1]) + Double.parseDouble(arr[2])) / 2;
        System.out.println(Math.sqrt(s * (s - Double.parseDouble(arr[0])) * (s - Double.parseDouble(arr[1])) * (s - Double.parseDouble(arr[2]))));
    }
    }
}
