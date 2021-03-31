import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 14:47
 */
public class Problem2_17 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temperatureFahrenheit = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        double speedWind = input.nextDouble();

        double windChillIndex = 35.74 + 0.6215 * temperatureFahrenheit - 35.75 * Math.pow(speedWind, 0.16)
                + 0.4275 * temperatureFahrenheit * Math.pow(speedWind, 0.16);

        System.out.printf("The wind chill index is %f", windChillIndex);
    }
}
