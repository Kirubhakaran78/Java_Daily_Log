package com.myapp.java_oops;

interface Vehicle1 {
    // Constant (public, static, final by default)
    int MAX_SPEED = 120;

    // Abstract method
    void start();

    // Default method (Java 8 feature)
    default void stop() {
        System.out.println("Vehicle stopped");
    }

    // Static method (Java 8 feature)
    static void info() {
        System.out.println("Vehicles are used for transportation");
    }
}

class Car1 implements Vehicle1 {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

public class InterfaceAdvancedDemo {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.start();
        c.stop();  // default method
        Vehicle1.info(); // static method

        System.out.println("Max Speed: " + Vehicle1.MAX_SPEED);
    }
}
