package EjerciciosHackerRank;
import java.util.Calendar;

public class ClaseCalendario {
    public static void main(String[] args) {
        Calendar fecha = Calendar.getInstance();
        fecha.set(2123, 2-1, 5);
        int dia = fecha.get(Calendar.DAY_OF_WEEK);

        String dayOfWeek[] = new String[] {
            "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"
        };
        System.out.println("The current date is: "+ dayOfWeek[dia-1]);
    }
}
