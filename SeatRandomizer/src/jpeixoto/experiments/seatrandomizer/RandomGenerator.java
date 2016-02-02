package jpeixoto.experiments.seatrandomizer;

/**
 * Created by codecadet on 28/01/16.
 */
public class RandomGenerator {
    public static int getRandom(int max){
        return getRandomByRange(0, max);
    }

    public static int getRandomByRange(int min, int max){
        return min + (int)(Math.random() * (max - min + 1));


        // return 0;
    }
}
