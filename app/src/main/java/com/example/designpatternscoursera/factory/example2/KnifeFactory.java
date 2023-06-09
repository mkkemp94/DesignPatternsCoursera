package com.example.designpatternscoursera.factory.example2;

import com.example.designpatternscoursera.factory.model.BreadKnife;
import com.example.designpatternscoursera.factory.model.ChefsKnife;
import com.example.designpatternscoursera.factory.model.Knife;
import com.example.designpatternscoursera.factory.model.ParingKnife;
import com.example.designpatternscoursera.factory.model.SteakKnife;

// Creational Design Pattern
public class KnifeFactory {

    public Knife createKnife(String knifeType) {
        Knife knife = null;

        // create Knife object - concrete instantiation
        if (knifeType.equals("steak")) {
            knife = new SteakKnife();
        } else if (knifeType.equals("chefs")) {
            knife = new ChefsKnife();
        } else if (knifeType.equals("bread")) {
            knife = new BreadKnife();
        } else if (knifeType.equals("paring")) {
            knife = new ParingKnife();
        }

        return knife;
    }
}
