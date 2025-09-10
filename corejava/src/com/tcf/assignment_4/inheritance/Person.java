package com.tcf.assignment_4.inheritance;

public class Person {
	
	protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}


