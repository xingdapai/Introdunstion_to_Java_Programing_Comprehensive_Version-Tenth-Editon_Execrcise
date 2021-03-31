import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 14:06
 */
public class Problem2_14 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weightPounds = input.nextDouble();
        System.out.print("Enter the height in inches: ");
        double heightInches = input.nextDouble();

        double weightKm = weightPounds * 0.445359237;
        double heightMeters = heightInches * 0.0254;

        double valueBMI = weightKm / (heightMeters * heightMeters);

        System.out.printf("BMI is %f\n", valueBMI);
    }
}
