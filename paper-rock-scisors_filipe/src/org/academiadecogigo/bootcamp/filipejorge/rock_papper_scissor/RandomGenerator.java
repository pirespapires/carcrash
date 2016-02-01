package org.academiadecogigo.bootcamp.filipejorge.rock_papper_scissor;

/**
 * Created by Filipe Jorge <Academia de Código_> on 25/01/16.
 */
public class RandomGenerator {


    public static int getRandom(int min, int max) {

        return min + (int) (Math.random() * (max-min+1));
    }
}
