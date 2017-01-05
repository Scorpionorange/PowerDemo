/**
 * Created by ScorpionOrange on 2017/01/05.
 */
public class PowerDemo {
    public static void main(String[] args){
        System.out.println("Testing");
        System.out.println("2 to the power of 10 is : " + power(2, 10));
    }

    public static long power(long base, int index){
        if(index == 0) return 1;
        if(index % 2 == 0) return power(base * base, index / 2);
        else return power(base * base, index / 2) * base;
    }
}
