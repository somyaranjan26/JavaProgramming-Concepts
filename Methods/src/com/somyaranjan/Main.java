package com.somyaranjan;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;

        int score = 800;
        int levelComplete = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelComplete, bonus);

        /*
        score = 1000;
        levelComplete = 8;
        bonus = 200;
        */

        int Score2nd = calculateScore(false, 1000, 8, 200);
        System.out.println(Score2nd);
    }

    public static int calculateScore(boolean gameOver, int score, int levelComplete, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your Final Score Is :" + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }

        // return -1;
    }
}
