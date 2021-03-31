import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 15:59
 */
public class Problem2_20 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");

        double balance = input.nextDouble();
        double interestRate = input.nextDouble();

        double interest = balance * (interestRate / 1200);
        System.out.printf("The interest is %f", interest);

    }
}
