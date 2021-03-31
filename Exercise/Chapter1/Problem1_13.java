/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 13:53
 */
public class Problem1_13 {
    public static void main(String[] args){

        double a, b, c, d, e, f, x, y;
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;

        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);

        System.out.printf("x = %f\n", x);
        System.out.printf("y = %f\n", y);
    }
}
