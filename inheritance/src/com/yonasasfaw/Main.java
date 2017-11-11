package com.yonasasfaw;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Bull dog", 3, 5, 5, 2, 2, "dark fur");

        dog.eat();

    }
}
