
import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i = 1;
        String str;
        while (sc.hasNext()){
            str = sc.nextLine();
            if(str.contains("end-of-file")){
                System.out.println(i + " " + str);
                break;
            }else{

            System.out.println(i + " " + str);
            i++;
            }
        }
        sc.close();
    }
}
