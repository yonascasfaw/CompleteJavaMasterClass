package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        //width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;
        //width of float = 32(4bytes)
        float myFloatValue = 5f / 3f;
        //width of double = 64(8bytes).
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        //pounds to kilogram

        double numpounds = 200d;
        double convertedKilograms = numpounds * 0.45359237;
        System.out.println( convertedKilograms + " kilograms");
        //90.7185

    }
}
