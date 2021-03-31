import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 14:36
 */
public class Problem2_16 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side:");
        double sideHexagon = input.nextDouble();

        double areaHexagon = 3 * Math.pow(3, 0.5) / 2 * sideHexagon * sideHexagon;
        System.out.printf("The area of the hexagon is %f", areaHexagon);

    }
}
