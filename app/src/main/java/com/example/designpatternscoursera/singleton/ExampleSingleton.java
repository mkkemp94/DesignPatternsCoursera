package com.example.designpatternscoursera.singleton;

// Creational Design Pattern
public class ExampleSingleton { // lazy construction

    // the class variable is null if no instance is instantiated
    private static ExampleSingleton uniqueInstance = null;

    private ExampleSingleton() { // private constructor

    }

    //lazy creation of the instance
    public static ExampleSingleton getInstance() {

        if (uniqueInstance == null) {
            uniqueInstance = new ExampleSingleton();
        }

        return uniqueInstance;
    }
}
