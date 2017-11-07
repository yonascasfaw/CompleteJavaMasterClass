package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        //challenge problem


        int highScorePosition = calculateHighScorePosition( 1500 );
        displayHighScorePosition( "Yonas", highScorePosition);

        highScorePosition = calculateHighScorePosition( 900 );
        displayHighScorePosition( "Robert", highScorePosition);

        highScorePosition = calculateHighScorePosition( 400 );
        displayHighScorePosition( "Ned", highScorePosition);

        highScorePosition = calculateHighScorePosition( 50 );
        displayHighScorePosition( "Jon", highScorePosition);

        highScorePosition = calculateHighScorePosition( 1000 );
        displayHighScorePosition( "Rob", highScorePosition);


    }


    public static void displayHighScorePosition(String playerName, int highScorePosition){
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table.");
    }

    public static int calculateHighScorePosition( int score){
        if (score >= 1000)
            return 1;
        else if(score >= 500 && score <1000)
            return 2;
        else if(score >= 100 && score <500)
            return 3;
        else
            return 4;
    }






    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}
