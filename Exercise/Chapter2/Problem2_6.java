import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 9:33
 */
public class Problem2_6 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        int digitSum = 0;
        while (number != 0){
            digitSum += number % 10;
            number /= 10;
        }

        System.out.printf("The sum of the digits is %d", digitSum);
    }
}
