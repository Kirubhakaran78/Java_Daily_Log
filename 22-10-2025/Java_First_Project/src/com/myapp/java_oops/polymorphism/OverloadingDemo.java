package com.myapp.java_oops.polymorphism;

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        MathOperation m = new MathOperation();
        System.out.println(m.add(10, 20));       // calls int method
        System.out.println(m.add(10.5, 20.3));   // calls double method
    }
}

//Overloading: same method name, different parameter list.
