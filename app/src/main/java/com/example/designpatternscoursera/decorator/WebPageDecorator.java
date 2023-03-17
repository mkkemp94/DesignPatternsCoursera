package com.example.designpatternscoursera.decorator;

public class WebPageDecorator implements WebPage{

    protected WebPage page;

    public WebPageDecorator(WebPage webpage) {
        this.page = webpage;
    }

    @Override
    public void display() {
        this.page.display();
    }
}
