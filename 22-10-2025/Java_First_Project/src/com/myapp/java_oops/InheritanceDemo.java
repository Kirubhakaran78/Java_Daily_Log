package com.myapp.java_oops;

//Parent Class
class Animal {
 void eat() {
     System.out.println("This animal eats food");
 }
}

//Child Class
class Dog extends Animal {
 void bark() {
     System.out.println("The dog barks");
 }
}

public class InheritanceDemo {
 public static void main(String[] args) {
     Dog d = new Dog();
     d.eat();  // Inherited from Animal
     d.bark(); // Defined in Dog
 }
}


//Dog inherits from Animal using extends.

//So Dog can use both its own methods and parent methods.
