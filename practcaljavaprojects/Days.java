import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Days {
    public static void main(String[] args) {
        // create a day today date
        LocalDate today = LocalDate.now();

        // Compute the date after 100 days
        LocalDate futureDate = today.plusDays(100);

        // Trace the day of the week for the future date
        String dayOfWeek = futureDate.getDayOfWeek().name();

        //then Check if today is Friday
        if (today.getDayOfWeek().name().equals("FRIDAY")) {
            System.out.println("Today is " + today.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))
                    + " (Friday).");
            System.out.println("The date after 100 days will be "
                    + futureDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) + " (" + dayOfWeek + ").");
        } else {
            System.out.println("Today is not Friday. Please run the program on a Friday.");
        }
    }

}
