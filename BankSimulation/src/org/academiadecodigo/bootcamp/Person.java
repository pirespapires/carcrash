package org.academiadecodigo.bootcamp;

/**
 * Created by ferrao on 26/01/16.
 */
public class Person {

    private String name;

    private PiggyBank piggyBank;
    private Wallet wallet;

    public Person(String name, PiggyBank piggyBank, Wallet wallet, int money) {
        this.name = name;
        this.piggyBank = piggyBank;
        this.wallet = wallet;

        wallet.add(money);
    }

    // returns true if able to spend the required amount of money
    public boolean spend(int money)  {
        int pocketMoney = wallet.use(money);

        // exception handling
        if (pocketMoney < money) {
            wallet.add(pocketMoney);
            return false;
        }

        return true;

    }

    public void fillWallet(int money) {
        wallet.add(piggyBank.widthraw(money));
    }

    public void saveMoney(int money) {

        piggyBank.deposit(wallet.use(money));

    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", piggyBank=" + piggyBank +
                ", wallet=" + wallet +
                '}';
    }

}
