import java.util.Scanner;

public class NombresYApellidosSanos11187 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        try {
            while(!words.isEmpty()){
                ordenaNombres(words.split(" "));
                words = sc.nextLine();
            }
        } catch (Exception e) {
            
        }
    }

    public static void ordenaNombres(String[] wordsSeparated) {
        switch (wordsSeparated.length) {
            case 2:
            System.out.printf("%s %s\n", wordsSeparated[1], wordsSeparated[0]);
            break;

            case 3:
            System.out.printf("%s %s %s\n", wordsSeparated[2], wordsSeparated[0], wordsSeparated[1]);
            break;

            case 4:
            System.out.printf("%s %s %s %s\n", wordsSeparated[2], wordsSeparated[3], wordsSeparated[0], wordsSeparated[1]);
            break;
        
            default:
            System.out.println("*");
            break;
        }
    }
}
