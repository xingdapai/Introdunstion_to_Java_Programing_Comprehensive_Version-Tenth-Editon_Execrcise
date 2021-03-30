import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 15:26
 */
public class Problem2_4 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds:");
        double pounds = input.nextDouble();

        System.out.printf("%.4f pounds is %.4f kilograms\n", pounds, pounds * 0.454);

    }
}
