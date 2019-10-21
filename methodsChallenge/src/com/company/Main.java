package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        String playerName = "Ariel";
        int score = 1500;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        int tablePosition = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, tablePosition);

        playerName = "Adam";
        score = 900;
        levelCompleted = 1;
        bonus = 1;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        tablePosition = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, tablePosition);

        playerName = "David";
        score = 400;
        levelCompleted = 1;
        bonus = 1;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        tablePosition = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, tablePosition);

        playerName = "Test";
        score = 50;
        levelCompleted = 1;
        bonus = 1;

        finalScore = calculateScore(gameOver, score, levelCompleted, bonus);
        tablePosition = calculateHighScorePosition(finalScore);
        displayHighScorePosition(playerName, tablePosition);
    }

    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;

    }

    public static void displayHighScorePosition(String playerName, int tablePosition) {
        System.out.println("Congrats " + playerName + " you managed to get into position " + tablePosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int highestScore = 1000;
        int secondScore = 500;
        int thirdScore = 100;
        if (playerScore > highestScore) {
            return 1;
        } else if (playerScore >= secondScore) {
            return  2;
        } else if (playerScore >= thirdScore) {
            return 3;
        } else {
            return 4;
        }
    }

}
