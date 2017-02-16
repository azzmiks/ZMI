package learningJava.importingFunctions;

import java.time.LocalDateTime;

/**
 * Created by azmiks on 16/02/2017.
 */
class L52_DateTime {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        System.out.println("\nCurrent time: " + date);

        date = date.withYear(2018);
        System.out.println("\nFuture time: " + date);

        String fields = "\nYear:\t\t\t" + date.getYear();
        fields += "\nMonh:\t\t\t" + date.getMonth();
        fields += "\nMonth number:\t\t" + date.getMonthValue();
        fields += "\nDay of week:\t\t" + date.getDayOfWeek();
        fields += "\nDay of month:\t\t" + date.getDayOfMonth();
        fields += "\nDay of year:\t\t" + date.getDayOfYear();
        fields += "\nHour (0-23):\t\t" + date.getHour();
        fields += "\nMinute:\t\t\t" + date.getMinute();
        fields += "\nSecond:\t\t\t" + date.getSecond();
        System.out.println(fields);
    }
}
