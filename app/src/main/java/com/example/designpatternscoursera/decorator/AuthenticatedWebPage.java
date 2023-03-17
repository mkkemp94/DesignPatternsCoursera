package com.example.designpatternscoursera.decorator;

import android.util.Log;

public class AuthenticatedWebPage extends WebPageDecorator {

    public AuthenticatedWebPage(final WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authenticateUser() {
        Log.i("AuthenticatedWebPage", "Authenticating User");
    }

    @Override
    public void display() {
        super.display();
        this.authenticateUser();
    }
}
