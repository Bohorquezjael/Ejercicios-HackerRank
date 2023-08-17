import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int b,h; 
static boolean flag;
    static {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        h = sc.nextInt();
        flag = true;
        sc.close();
        try{
        if (b <= 0 || h <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        
        if(flag){
            System.out.println(h*b);
        }
    }
}
