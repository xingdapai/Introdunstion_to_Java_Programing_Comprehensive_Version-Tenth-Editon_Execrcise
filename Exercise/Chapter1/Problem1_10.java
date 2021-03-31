/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 11:23
 */
public class Problem1_10 {

    public static void main(String[] args){

        double usedTime = 45.5 / 60;
        double distanceByMile = 14 / 1.6;

        double speedByMile = distanceByMile / usedTime;

        System.out.printf("His speed is %.2f miles/h.", speedByMile);

    }
}
