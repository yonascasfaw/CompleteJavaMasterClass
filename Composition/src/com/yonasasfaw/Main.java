package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();


        //Challenge problem

        System.out.println("*************************************");

        Sink sink = new Sink(dimensions,"silver", 2, false);

        Fridge fridge = new Fridge("samsung", new Dimensions(45,98,54), new Capacity(5,3),
                2, "white");

        Stove stove = new Stove(4,"Silver","panasonic",new Dimensions(56,43,76));

        Kitchen mykitchen = new Kitchen(stove,fridge,sink);

        mykitchen.getFridge().makeSomePops();

        mykitchen.makeSomeEggs();



    }
}
