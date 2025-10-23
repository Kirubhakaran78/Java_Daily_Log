package com.myapp.java_oops;

//Encapsulation Example
class Student {
 private String name; // private variable (data hiding)

 // Setter method (to set data)
 public void setName(String name) {
     this.name = name;
 }

 // Getter method (to get data)
 public String getName() {
     return name;
 }
}

public class EncapsulationDemo {
 public static void main(String[] args) {
     Student s = new Student();
     s.setName("Kirubhakaran");
     System.out.println("Student Name: " + s.getName());
 }
}

//The name variable is private — can’t be accessed directly outside the class.

//We use getters and setters to control access → ensures data safety

