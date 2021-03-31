import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 14:51
 */
public class Problem2_1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double degreeCelsius = input.nextDouble();
        double degreeFahrenheit = (9.0 / 5.0) * degreeCelsius + 32;

        System.out.printf("%.1f Celsius is %.1f Fahrenheit", degreeCelsius, degreeFahrenheit);

    }
}
