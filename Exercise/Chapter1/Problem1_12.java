/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 13:46
 */
public class Problem1_12 {

    public static void main(String[] args){

        double distanceByKm = 24 * 1.6;
        double usedTime = 60 + 40 + 35.0 / 60;

        double speedByKM = distanceByKm / usedTime;

        System.out.printf("His speed is %.2f km/h", speedByKM);
    }
}