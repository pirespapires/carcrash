package org.academiadecodigo;

/**
 * Created by ferrao on 17/09/15.
 */
public class Player {

    private String name;
    private int victories;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVictories() {
        return victories;
    }

    public void win() {
        victories++;
    }

    public GameHand choose() {

        int h = (int) (Math.random() * GameHand.values().length);
        GameHand hand = GameHand.values()[h];

        System.out.println(name + " has " + victories + " victories, now chooses " + hand);

        return hand;
    }

}
