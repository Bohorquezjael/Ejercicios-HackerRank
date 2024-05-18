import java.util.Random;

public class PruebaExamen {
    private int i;
    private int j;
    private int k;
    
    public static void main(String[] args){
        //numero random entre 0 y 100
        Random random = new Random();
        while(i++ <= 10){
            if(i % 2 == 0){
                System.out.println(random.nextInt(101));
            }
        }
        for (int j = 0; j < args.length; j++) {
            
        }
        
    }
}