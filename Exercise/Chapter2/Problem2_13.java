import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 14:01
 */
public class Problem2_13 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double amountMonthly = input.nextDouble();
        double amountNow = 0;

        amountNow = (amountNow + amountMonthly) * (1 + 0.00417);
        amountNow = (amountNow + amountMonthly) * (1 + 0.00417);
        amountNow = (amountNow + amountMonthly) * (1 + 0.00417);
        amountNow = (amountNow + amountMonthly) * (1 + 0.00417);
        amountNow = (amountNow + amountMonthly) * (1 + 0.00417);
        amountNow = (amountNow + amountMonthly) * (1 + 0.00417);

        System.out.printf("After the sixth month, the account value is $%.2f\n", amountNow);
    }
}
