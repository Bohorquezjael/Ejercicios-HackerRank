import java.util.Scanner;

public class AlReves932 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums = sc.nextLine();
        for (Character n : nums.toCharArray()) {
            if(n != ' '){
            System.out.print(n == '1' ? "0 " : "1 ");
        }
        }
            
    }
}
