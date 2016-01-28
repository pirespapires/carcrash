package org.academiadecogigo.bootcamp.filipejorge.rock_papper_scissor;

/**
 * Created by Filipe Jorge <Academia de Código_> on 27/01/16.
 */
public class GameRPS {

    private Player player1;
    private Player player2;


    private int roundsWin;

    public GameRPS(Player player1, Player player2, int maxRounds) {
        this.player1 = player1;
        this.player2 = player2;
        this.roundsWin = maxRounds;
    }

    public static String showRules() { //©ITA
        return "RULES:\n" +
                "Scissors cuts Paper, Paper covers Rock,\n" +
                "Rock crushes Lizard, Lizard poisons Spock,\n" +
                "Spock smashes Scissors, Scissors decapitates Lizard,\n" +
                "Lizard eats Paper, Paper disproves Spock,\n" +
                "Spock vaporizes Rock, (and as it always was) Rock crushes Scissors!\n" +
                "Scissors make a haircut(non conservative) to Jane Hawk,\n" +
                "Jane Hawk puts Paulo to play Cof-Cof-bol,\n" +
                "Paulo says that we don't know what \"The BigBang Theory\" is to Mariana,\n" +
                "Mariana corrects Mike's code,\n" +
                "\"Mike being Mike\" talking to Duck Chambel,\n" +
                "Duck Chambel blocks the Nuno's throw,\n" +
                "Nuno dunks Joana Peixoto,\n" +
                "Joana talks portonhol to Milena,\n" +
                "Milena casts a spell to Ita,\n"+
                "Ita does nothing to Professor Jairson,\n"+
                "Professor Jairson teaches GIT to Romero,\n"+
                "Romero teaches GIT to Joana Vasconcelos,\n"+
                "Joana turns back and breaks Tiago's concentration,\n"+
                "Tiago explains recursion to André\n"+
                "André makes a Kenpō's strike to Sérgio\n"+
                "Sérgio doesn't even flinches to Filipe's jokes\n"+
                "(and as it always was) Filipe crushes Scissors!";
    }

    public void play() {

        int scorePlayer1 = 0;
        int scorePlayer2 = 0;


        System.out.println(this.showRules()); //@ ITA

        while (!(scorePlayer1 > roundsWin - 1 || scorePlayer2 > roundsWin - 1)) {

            Choices p1Choice = player1.chooseOption();
            Choices p2Choice = player2.chooseOption();

            System.out.println("P1 " + p1Choice + " VS " + p2Choice + " P2");

            int p1 = p1Choice.ordinal();// + 1;
            int p2 = p2Choice.ordinal();// + 1;

            int choicesLen = Choices.values().length;


            int whoWins = (choicesLen + p1 - p2) % choicesLen; //@Joana Falcão

            if (p1 == p2) {
                System.out.println("Draw");

            } else if (whoWins % 2 == 0) { //TODO: affect score directly. (p1)%2 = 0 (p2)%2= 1

                scorePlayer1++;
                System.out.println("Player1 wins");

            } else {
                scorePlayer2++;
                System.out.println("Player2 wins");

            }
            System.out.println("Score: " + scorePlayer1 + " " + scorePlayer2 + "\n");
        }

        System.out.println("Player " + (scorePlayer1 > scorePlayer2 ? "player1" : "player2") + " WINS!!!!");


    }


}



