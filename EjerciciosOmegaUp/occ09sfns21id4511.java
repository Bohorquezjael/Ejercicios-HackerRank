import java.util.Scanner;

public class occ09sfns21id4511 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line.split(" ")[2]), i = 0;
        String s1 = line.split(" ")[0];
        String s2 = line.split(" ")[1];
        if(n ==  1){
            for (char c : s1.toCharArray()) {
            System.out.print(c);
            System.out.print(s2.charAt(i));
            i++;
            }
        }else{
            for (char c: s2.toCharArray()) {
                System.out.print(c);
                System.out.print(s1.charAt(i));
                i++;
            }
        }
    }
}
