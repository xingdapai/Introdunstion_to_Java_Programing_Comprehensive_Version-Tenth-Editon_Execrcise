/**
 * @author Patrick Fan
 * @version 1.0
 * @date 2021/3/20 16:18
 */
public class Problem1_7 {
    public static void main(String[] args){
        //to avoid warnings of "Multiple occurrence of 'xxx'"
        double pi1 = (1.0 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11);
        double pi2 = pi1 + 1.0 / 13;
        System.out.println(4 * pi1);
        System.out.println(4 * pi2);
    }
}
