import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 15:15
 */
public class Problem2_3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a value for feet:");
        double feet = input.nextDouble();
        System.out.printf("%.4f feet is %.4f meters", feet, feet * 0.305);

    }
}
