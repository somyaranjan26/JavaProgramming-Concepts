package com.somyaranjan;

public class Challenge {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Ronaldo", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Messi", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Neymar", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Pugba", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Zlatan", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position "
                + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(playerScore >= 1000){
            return 1;
        }
        else if(playerScore >= 500) {
            return 2;
        }

        else if(playerScore >= 100) {
            return 3;
        }

        else {
            return 4;
        }
    }

}
