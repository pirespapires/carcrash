package org.academiadecodigo.bootcamp;

/**
 * Created by ferrao on 26/01/16.
 */
public class Main {

    public static void main(String[] args) {

        Wallet w = new Wallet();
        Wallet w2 = new Wallet();
        PiggyBank pb = new PiggyBank();

        Person p1 = new Person("Catarina", pb, w, 500);
        System.out.println(p1);

        Person p2 = new Person("Joana", pb, w2, 0);
        System.out.println(p2);

        p1.saveMoney(200);
        System.out.println(p1);
        System.out.println(p2);

        p1.spend(100);
        System.out.println(p1);
        System.out.println(p2);

    }
}
