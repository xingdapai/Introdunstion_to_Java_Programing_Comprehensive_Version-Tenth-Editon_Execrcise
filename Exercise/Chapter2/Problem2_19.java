import java.util.Scanner;

/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/31 15:43
 */
public class Problem2_19 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle: ");
        double x1, x2, x3, y1, y2, y3;

        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        double lengthEdge1 = Math.pow((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1) ,0.5);
        double lengthEdge2 = Math.pow((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2) ,0.5);
        double lengthEdge3 = Math.pow((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3) ,0.5);
        double s = (lengthEdge1 + lengthEdge2 + lengthEdge3) / 2;

        double areaTriangle = Math.pow(s * (s - lengthEdge1) * (s - lengthEdge2) * (s - lengthEdge3) ,0.5);

        System.out.printf("The area of the triangle is %f", areaTriangle);


    }
}
