import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 15:32
 */
public class Problem2_5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate:");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        double gratuity = subtotal * gratuityRate / 100.0;
        System.out.printf("The gratuity is $%.2f and total is $%.2f\n", gratuity, gratuity + subtotal);
    }
}
