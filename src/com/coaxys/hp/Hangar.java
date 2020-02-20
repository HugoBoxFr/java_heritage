package com.coaxys.hp;

public class Hangar {
    public static void main(String[] args) {
        Car bmw = new Car("BMW");
        Boat luxboat = new Boat("Luxboat");

        System.out.println(bmw.doStuff());
        System.out.println(luxboat.doStuff());

    }
}
