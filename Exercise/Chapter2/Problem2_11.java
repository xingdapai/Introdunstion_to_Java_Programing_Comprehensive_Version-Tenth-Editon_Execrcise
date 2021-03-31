import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 13:49
 */
public class Problem2_11 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");

        int years = input.nextInt();
        int secondsInYears = 365 * 24 * 60 * 60 * years;

        int populationNow = 312032486 + secondsInYears / 7 - secondsInYears / 13 + secondsInYears / 45;

        System.out.printf("The population in %d years is %d",years, populationNow);
    }
}
