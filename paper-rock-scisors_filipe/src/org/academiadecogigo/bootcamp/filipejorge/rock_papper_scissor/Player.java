package org.academiadecogigo.bootcamp.filipejorge.rock_papper_scissor;

/**
 * Created by Filipe Jorge <Academia de Código_> on 27/01/16.
 */
public class Player {

    public Choices chooseOption() {
        int index = RandomGenerator.getRandom(0, Choices.values().length-1);
        return Choices.values()[index];
    }

    @Override
    public String toString() {
        return "Player{" +
                '}';
    }
}
