import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 16:28
 */
public class Problem2_21 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years: ");
        double numberYears = input.nextDouble();

        double valueAccumulate = investmentAmount * Math.pow((1 + interestRate / 1200), numberYears * 12);
        System.out.printf("Accumulate value is $%f", valueAccumulate);
    }
}
