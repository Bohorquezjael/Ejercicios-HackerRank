import java.util.Scanner;

public class NumMenorEnUnArreglo4451 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int menor = Integer.MAX_VALUE, index = 0;
        for(int i = 0; i < 10; i++){
            int x = sc.nextInt();
            if(x < menor){
                menor = x;
                index = i;
            }
        }
        // for(int i = 0; i < 10; i++){
        //     arr[i] = sc.nextInt();
        //     if(arr[i] < menor){
        //         menor = arr[i];
        //         index = i;
        //     }
        // }
        System.out.println(menor + " " + index);
    }
}
