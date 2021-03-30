/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 13:53
 */
public class Problem13 {
    public static void main(String[] args){

        double a, b, c, d, e, f;
        a = 3.4;
        b = 50.2;
        c = 2.1;
        d = 0.55;
        e = 44.5;
        f = 5.9;

        System.out.printf("x = %f\n", (e * d - b * f) / (a * d - b * c));
        System.out.printf("y = %f\n", (a * f - e * c) / (a * d - b * c));
    }
}
