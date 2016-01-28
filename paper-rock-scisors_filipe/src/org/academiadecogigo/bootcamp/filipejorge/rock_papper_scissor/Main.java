package org.academiadecogigo.bootcamp.filipejorge.rock_papper_scissor;

/**
 * Created by Filipe Jorge <Academia de Código_> on 27/01/16.
 */
public class Main {

    public static void main(String[] args) {

        Player p1 = new Player();
        Player p2 = new Player();

        GameRPS game = new GameRPS(p1, p2, 3);
        game.play();

/*
        int i = 0;
        long tStart = System.currentTimeMillis();
        while (i < 1000000) {

            game.play();
            System.out.println(i);
            i++;
        }

        System.out.println("\nApp taken " + ((System.currentTimeMillis() - tStart) * 0.001) + " seconds to execute.");
*/

/*
      String[] winner = {"zero","e","p1","p2","p2","e","p1","p1","p2","e"};
      int c = 1;
        for (int p1 = 1; p1<=3 ; p1++) {
            for (int p2 = 1; p2<=3 ; p2++) {
                int eureka = (p1 - (p2%3));


                System.out.println((p1 - (p2%3)) + " " + p1 + " " + p2 + " " + (p2 - (p1%3)) + " " + winner[c++] );
    }}
*/
    }
}



