package org.academiadecodigo.bootcamp;

/**
 * Created by ferrao on 26/01/16.
 */
public class PiggyBank {

    private int money;

    // returns the amount of money widthraw
    public int widthraw(int money) {

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

    public void deposit(int money) {
       this.money += money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "PiggyBank{" +
                "money=" + money +
                '}';
    }
}

