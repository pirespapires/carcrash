package org.academiadecodigo.bootcamp;

/**
 * Created by ferrao on 26/01/16.
 */
public class Wallet {

    private int money;

    // returns the money removed from the wallet
    public int use(int money) {

        // exception case handling
        if (money > this.money) {
            int removedMoney = this.money;
            this.money = 0;
            return removedMoney;
        }

        // normal case
        this.money -= money;
        return money;

    }

    public void add(int money) {
        this.money += money;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "money=" + money +
                '}';
    }
}
