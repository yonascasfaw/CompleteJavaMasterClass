package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        System.out.println("unicode ouput was: " + myChar);

        boolean myBoolean = false;
        boolean isMale = true;

        //challenge problem - make a character variable for register symbol and print to screen

        char register = '\u00AE';
        System.out.println("Unicode output for register is: " + register);

    }
}
