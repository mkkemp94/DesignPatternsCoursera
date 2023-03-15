package com.example.designpatternscoursera.factory.example3;

import com.example.designpatternscoursera.factory.model.Knife;

public abstract class KnifeStore {

    public Knife orderKnife(String knifeType) {

        // Create knife using method of this class
        Knife knife = createKnife(knifeType);

        // Prepare the knife
        knife.sharpen();;
        knife.polish();
        knife.pack_age();

        return knife;
    }

    // Subclasses will define how to create knives
    abstract Knife createKnife(String knifeType);
}
