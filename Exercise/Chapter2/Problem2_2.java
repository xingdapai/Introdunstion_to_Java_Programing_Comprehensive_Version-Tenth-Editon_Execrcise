import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 15:01
 */
public class Problem2_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");

        double radius = input.nextDouble();
        double height = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * height;

        System.out.printf("The area is %.2f.\nThe volume is %.2f\n", area, volume);

    }
}
