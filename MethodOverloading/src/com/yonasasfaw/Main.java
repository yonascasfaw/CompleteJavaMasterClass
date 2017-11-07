package com.yonasasfaw;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Yonas",500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        //Challenge problem
        calcFeetAndInchesToCentimeters(6, 3);
        calcFeetAndInchesToCentimeters(9);


    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0 && inches >=0 && inches <=12){
            double cent = (inches * 2.54) + (feet * 12 * 2.54);
            System.out.println(feet + " feet " + inches + " inches " + " is " + cent);
            return cent;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if( inches >= 0 ){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            double cent = calcFeetAndInchesToCentimeters(feet, remainingInches);
            return cent;
        }
        return -1;
    }



    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

}
