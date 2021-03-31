import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 13:53
 */
public class Problem2_12 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the speed and acceleration: ");

        double v = input.nextDouble();
        double a = input.nextDouble();

        double runwayLength = 0.5 * v * v / a;
        System.out.printf("The minimum runway length for this plane is %f", runwayLength);
    }
}
