package com.example.designpatternscoursera.factory.model;

import android.util.Log;

public class ChefsKnife extends Knife {

    public static final String TAG = "ChefsKnife";

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
