package org.academiadecodigo;

public class Game {

    int maxRounds;
    int rounds = 0;

    Player player1;
    Player player2;

    public Game(int maxRounds, Player player1, Player player2) {
        this.maxRounds = maxRounds;
        this.player1 = player1;
        this.player2 = player2;
    }

    void start() {

        while(rounds < maxRounds) {
            playRound();
        }

        displayResults();
    }

    void playRound() {

        GameHand p1Hand = player1.choose();
        GameHand p2Hand = player2.choose();

        rounds++;

        // It's a tie, let' play another round
        if (p1Hand == p2Hand) {
            playRound();
            return;
        }

        Player winner = player1;

        switch (p1Hand) {

            case PAPER:

                if (p2Hand == GameHand.SCISORS) {
                    winner = player2;
                }
                break;

            case ROCK:
                if (p2Hand == GameHand.PAPER) {
                    winner = player2;
                }
                break;

            case SCISORS:
                if (p2Hand == GameHand.ROCK) {
                    winner = player2;
                }
                break;
        }

        winner.win();

    }

    private void displayResults() {

        System.out.println("=== GAME END ===");
        System.out.println(player1.getName() + " has " + player1.getVictories() + " victories");
        System.out.println(player2.getName() + " has " + player2.getVictories() + " victories");

        System.out.println("WINNER IS : " + (player1.getVictories() > player2.getVictories() ? player1.getName() : player2.getName()));

    }

}
