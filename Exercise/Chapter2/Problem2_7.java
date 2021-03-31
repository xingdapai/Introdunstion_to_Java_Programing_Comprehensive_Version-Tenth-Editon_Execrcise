import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 9:40
 */
public class Problem2_7 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int days = (minutes / 60) / 24;
        int years = days / 365;
        days %= 365;

        System.out.printf("%d minutes is approximately %d years and %d days", minutes, years, days);
    }
}
