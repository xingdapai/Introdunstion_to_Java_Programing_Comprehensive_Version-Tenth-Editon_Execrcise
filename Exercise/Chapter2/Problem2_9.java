import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 10:25
 */
public class Problem2_9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1 ant t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        double a = (v1 - v0) / t;

        System.out.printf("The average acceleration is %f", a);
    }
}