/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/30 13:39
 */
public class Problem1_11 {
    public static void main(String[] arg){

        int secondsIn5Years = 365 * 24 * 60 * 60 * 5;

        System.out.println(312032486 + secondsIn5Years / 7 - secondsIn5Years / 13 + secondsIn5Years / 45);
    }
}
