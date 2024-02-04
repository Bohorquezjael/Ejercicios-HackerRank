
import java.util.*;
import java.io.*;

class MapJava {
    @SuppressWarnings("unlikely-arg-type")
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, String> phoneBook = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            String phone = in.nextLine();
            phoneBook.put(name, phone);
        }
        while (n-- > 0) {
            String s = in.nextLine();
            if(phoneBook.containsKey(s)){
                System.out.printf("%s=%s",  s, phoneBook.get(s));
            }else if(phoneBook.containsKey(new StringBuilder(s).reverse())){
                System.out.printf("%s=%s",  s, phoneBook.get(new StringBuilder(s).reverse()));
            }else{
                System.out.println("Not found");
            }
        }
    }
}
