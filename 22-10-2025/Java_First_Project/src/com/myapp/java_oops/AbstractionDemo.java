package com.myapp.java_oops;


//Abstraction -> Abstraction means showing only essential details and hiding implementation.
// In Java, we achieve this using abstract classes or interfaces.


//Abstract Class
abstract class Vehicle {
 abstract void start(); // abstract method (no body)

 void fuelType() {
     System.out.println("Uses petrol or diesel");
 }
}

//Subclass providing implementation
class Car extends Vehicle {
 void start() {
     System.out.println("Car starts with a key");
 }
}

public class AbstractionDemo {
 public static void main(String[] args) {
     Vehicle v = new Car();
     v.start();     // Calls implemented method
     v.fuelType();  // Calls concrete method
 }
}



//Vehicle has an abstract method start() — it doesn’t specify how to start.
//The subclass Car defines its own way.