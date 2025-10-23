package com.myapp.java_oops.polymorphism;

class Animal {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Animal a = new Dog(); // Parent reference, child object
        a.sound(); // calls Dog's overridden method
    }
}

//Overriding: same method name + parameters, but defined differently in child class.
