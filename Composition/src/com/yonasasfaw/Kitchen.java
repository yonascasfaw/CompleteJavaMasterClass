package com.yonasasfaw;

public class Kitchen {
    private Stove stove;
    private Fridge fridge;
    private Sink sink;


    public Kitchen(Stove stove, Fridge fridge, Sink sink) {
        this.stove = stove;
        this.fridge = fridge;
        this.sink = sink;
    }

    public void makeSomeEggs(){
        System.out.println("all done in the kitchen");
        stove.startCooking();
        cleaningUp();
    }

    public void cleaningUp(){
        sink.washPlates();
    }

    public Stove getStove() {
        System.out.println("First at kitchen ");
        return stove;
    }

    public Fridge getFridge() {
        return fridge;
    }

    public Sink getSink() {
        return sink;
    }
}
