import java.util.Scanner;

public class Canchas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        int areaTotal = ((Math.abs(x2 - x1) * Math.abs(y2 - y1)) + (Math.abs(x4 - x3) * Math.abs(y4 - y3)));
        if(x3 < x2 && y3 < y2 && y4 > y1 && x4 > x1){
            int interseccionX = Math.min(x2, x4) - Math.max(x1, x3);
            int interseccionY = Math.min(y2, y4) - Math.max(y1, y3);
            int areaInterseccion = Math.abs(interseccionX) * Math.abs(interseccionY);
            areaTotal -= areaInterseccion;
            System.out.println(areaTotal);
        }else{
            System.out.println(areaTotal);
        }
    }
}
