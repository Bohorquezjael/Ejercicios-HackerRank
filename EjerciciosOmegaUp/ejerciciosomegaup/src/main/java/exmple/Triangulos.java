package ejerciciosomegaup.src.main.java.exmple;



import java.util.Scanner;
//TODO
public class Triangulos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int large = sc.nextInt();
        int group[] = new int[large];
        for(int i = 0; i < group.length; i++){
            group[i] = sc.nextInt();
        }
        sc.close();
    }
}
