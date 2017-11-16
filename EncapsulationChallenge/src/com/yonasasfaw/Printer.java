package com.yonasasfaw;

public class Printer {

    private double tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(double tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        if(tonerLevel <= 100 && tonerLevel >= 0){
            this.tonerLevel = tonerLevel;
        }else if(tonerLevel >= 100){
            this.tonerLevel = 100;
        }else{
            this.tonerLevel = 0;
        }

        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public void fillToner(double ink){
        if((this.tonerLevel + ink) <= 100){
            this.tonerLevel += ink;
        }else if((this.tonerLevel + ink) > 100){
            this.tonerLevel = 100;
        }
        System.out.println(ink + " percent has been added to toner and current level is " +
                this.tonerLevel + " percent.");
    }

    public void printing(int print){
        this.numberOfPagesPrinted += print;
        System.out.println("You have printed " + this.numberOfPagesPrinted + " pages.");
    }

    public double getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }
}
