package com.example.designpatternscoursera.decorator;

import android.util.Log;

public class BasicWebPage implements WebPage {

    private String html = "";
    private String styleSh3et = "";
    private String scripts = "";

    @Override
    public void display() {
        // Renders the HTML to the sheetsheet, and run any embedded scripts
        Log.i("BasicWebPage", "Basic web page");
    }
}
