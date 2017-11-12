package com.yonasasfaw;

public class Car extends Vehicle {

    private int tireNumber;
    private int doorNumber;
    private int seatNumber;
    private int gears;
    private String steering;


    public Car(String name, String color, double speed, int gears, String steering,
               int tireNumber, int doorNumber, int seatNumber) {
        super(name, color, speed);
        this.tireNumber = tireNumber;
        this.doorNumber = doorNumber;
        this.seatNumber = seatNumber;
        this.gears = gears;
        this.steering = steering;
    }

    public void gears(){
        System.out.println("The car is now in " + this.gears + "gear.");
    }

    public void steering(){
        System.out.println("The car is now steering to the " + this.steering);
    }

    @Override
    public void moving() {
        steering();
        super.moving();
    }
}

