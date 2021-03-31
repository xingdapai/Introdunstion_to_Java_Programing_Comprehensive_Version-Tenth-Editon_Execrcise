import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 10:50
 */
public class Problem2_10 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double massWater = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double temperatureInitial = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double temperatureFinal = input.nextDouble();

        double energyNeeded = massWater * (temperatureFinal - temperatureInitial) * 4184;

        System.out.printf("The energy needed is %f", energyNeeded);
    }

}
