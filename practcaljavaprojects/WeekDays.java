import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WeekDays {
    public static void main(String[] args) {
        //create a local date which is today
        LocalDate today = LocalDate.now();
        //  compute the date after 100 days
        LocalDate futureDate = today.plusDays(100);
        // then look for the future date
        String daysOfWeek = futureDate.getDayOfWeek().name();
        //here you can check if the day is friday or not
        if (today.getDayOfWeek().name().equals("Friday")) {

            System.out.println("Today is" + today.format(DateTimeFormatter.ofPattern("YYYY-MM-DD")) + ("Friday"));
            System.out.println("The date after 10000 will be" +
                    futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " (" + daysOfWeek + ").");
        } else {
            System.out.println("The day will be your day sunday to start your week.");
        }
    }
}
