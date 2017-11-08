package com.yonasasfaw;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {

//        int switchValue = 6;
//
//        switch(switchValue) {
//            case 1:
//                System.out.println("Value is 1");
//                break;
//            case 2:
//                System.out.println("Value was 2");
//                break;
//            case 3:
//                System.out.println("was a 3, or a 4, or a 5");
//                System.out.println("Actually it was a " + switchValue);
//                break;
//
//            default:
//                System.out.println("Was not 1, 2, 3, 4 or 5");
//                break;
//        }

        //challenge problem


        char grade = 'E';

        switch (grade){
            case 'A':
                System.out.println("The grade is " + grade);
                break;

            case 'B':
                System.out.println("The grade is " + grade);
                break;

            case 'C': case 'D': case 'E':
                System.out.println("The grade is " + grade);
                break;

//            case 'D':
//                System.out.println("The grade is " + grade);
//                break;
//
//            case 'E':
//                System.out.println("The grade is " + grade);
//                break;

            default:
                System.out.println("The grade was not found");

        }

        String month = "JuNE";
        switch (month.toUpperCase()){
            case "JANUARY":
                System.out.println("Jan");
                break;

            case "JUNE":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not Sure");
                break;

        }



    }
}
