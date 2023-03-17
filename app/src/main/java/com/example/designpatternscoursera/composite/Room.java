package com.example.designpatternscoursera.composite;

import android.util.Log;

// Leaf class
public class Room implements IStructure {

    private final String name;

    public Room(String name) {
        this.name = name;
    }

    @Override
    public void enter() {
        Log.i("Room", "enter");
    }

    @Override
    public void exit() {
        Log.i("Room", "exit");
    }

    @Override
    public void location() {
        Log.i("Housing", "You are currently in " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
