package com.example.designpatternscoursera.proxy.example2;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverhost)
    {
        System.out.println("Connecting to "+ serverhost);
    }
}
