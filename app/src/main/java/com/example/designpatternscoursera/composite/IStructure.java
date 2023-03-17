package com.example.designpatternscoursera.composite;

// Supports polymorphism for component and leaf classes
public interface IStructure {
    void enter();
    void exit();
    void location();
    String getName();
}
