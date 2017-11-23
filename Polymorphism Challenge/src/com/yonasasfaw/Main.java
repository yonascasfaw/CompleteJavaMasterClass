package com.yonasasfaw;

import com.sun.org.apache.xpath.internal.SourceTree;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private double speed;
    private boolean engineRunning;

    public Car(String name, int cylinders) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.speed = 0;
        this.engineRunning = false;
    }

    public void startEngine(){
        this.engineRunning = true;
        System.out.println("Engine has turned on.");
    }
    public int accelerate(double speed){
        if(speed < 0){
            System.out.println("Impossible speed");
            return -1;
        }else{
            this.speed = speed;
            System.out.println("The speed has been set to " + speed);
            return 0;
        }
    }

    public void brake(){
        this.speed = 0;
        System.out.println("The car has stopped and the speed has been set to " + this.speed);
    }


    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public double getSpeed() {
        return speed;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }
}


class Camaro extends Car{
    public Camaro(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Engine is roaring like a panther.");
    }
}

class Challenger extends Car{
    public Challenger(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public int accelerate(double speed) {
        System.out.println("this is challenge type acceleration");
        return super.accelerate(speed);
    }
}

class Mustang extends Car{
    public Mustang(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("Thee brakes make the car do donuts.");
    }
}

public class Main {

    public static void main(String[] args) {

        Camaro camero = new Camaro("Hot mama", 8);
        camero.startEngine();
        Challenger challenger = new Challenger("Black Knight", 12);
        challenger.accelerate(95);
        Mustang mustang = new Mustang("Blue bird", 6);
        mustang.brake();

    }
}
