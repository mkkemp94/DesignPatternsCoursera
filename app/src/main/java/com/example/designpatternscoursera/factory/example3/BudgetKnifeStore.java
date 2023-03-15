package com.example.designpatternscoursera.factory.example3;

import com.example.designpatternscoursera.factory.model.BudgetChefsKnife;
import com.example.designpatternscoursera.factory.model.BudgetSteakKnife;
import com.example.designpatternscoursera.factory.model.Knife;

public class BudgetKnifeStore extends KnifeStore {

    Knife createKnife(final String knifeType) {
        if (knifeType.equals("steak")) {
            return new BudgetSteakKnife();
        } else if (knifeType.equals("chefs")) {
            return new BudgetChefsKnife();
        } else return null;
    }
}
