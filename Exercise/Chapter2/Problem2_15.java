import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 14:31
 */
public class Problem2_15 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) ,0.5);

        System.out.printf("The distance between the two points is %f", distance);

    }
}
