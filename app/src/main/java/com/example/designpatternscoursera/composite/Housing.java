package com.example.designpatternscoursera.composite;

import android.util.Log;

import java.util.ArrayList;

// Composite class
public class Housing implements IStructure {

    private final ArrayList<IStructure> structures;
    private final String address;

    public Housing(String address) {
        this.structures = new ArrayList<>();
        this.address = address;
    }

    public int addStructure(IStructure component) {
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber) {
        return this.structures.get(componentNumber);
    }

    @Override
    public void enter() {
        Log.i("Housing", "enter");
    }

    @Override
    public void exit() {
        Log.i("Housing", "exit");
    }

    @Override
    public void location() {
        Log.i("Housing", "You are currently in " + this.getName() + ". It has: ");
        for (IStructure struct : this.structures)
            Log.i("Housing", struct.getName());
    }

    @Override
    public String getName() {
        return this.address;
    }
}
