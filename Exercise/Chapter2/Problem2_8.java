import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 9:48
 */
public class Problem2_8 {

    public static void main(String[] args){
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = totalHours % 24;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timeOffset = input.nextInt();

        long offsetHour = currentHour + timeOffset;
        if (offsetHour < 0)
            offsetHour += 24;
        else if (offsetHour >= 24)
            offsetHour %= 24;

        System.out.printf("The current time is %d:%d:%d", offsetHour, currentMinute, currentSecond);




    }
}
