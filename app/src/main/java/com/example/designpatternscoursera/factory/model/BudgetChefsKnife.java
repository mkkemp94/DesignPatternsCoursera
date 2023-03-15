package com.example.designpatternscoursera.factory.model;

import android.util.Log;

public class BudgetChefsKnife extends Knife {

    public static final String TAG = "BudgetChefsKnife";

    public void sharpen() {
        Log.i(TAG, "sharpen");
    }

    public void polish() {
        Log.i(TAG, "polish");
    }

    public void pack_age() {
        Log.i(TAG, "package");
    }
}