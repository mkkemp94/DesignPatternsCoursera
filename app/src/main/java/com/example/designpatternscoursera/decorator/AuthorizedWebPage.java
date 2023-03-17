package com.example.designpatternscoursera.decorator;

import android.util.Log;

public class AuthorizedWebPage extends WebPageDecorator {

    public AuthorizedWebPage(final WebPage decoratedPage) {
        super(decoratedPage);
    }

    public void authorizeUser() {
        Log.i("AuthorizedWebPage", "Authorizing User");
    }

    @Override
    public void display() {
        super.display();
        this.authorizeUser();
    }
}
