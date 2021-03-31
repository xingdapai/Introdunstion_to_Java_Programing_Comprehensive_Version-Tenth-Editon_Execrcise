import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 16:27
 */
public class Problem2_22 {

    public static void main(String[] args){
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in integer for example 1156 (the last 2 digits represent cents): ");

        int originAmount = input.nextInt();
        int remainingAmount = originAmount;

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickles in the remaining amount
        int numberOfNickles = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies =remainingAmount;

        // Display results
        System.out.println("Your amount " + originAmount + " consisit of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickles + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");

    }
}
