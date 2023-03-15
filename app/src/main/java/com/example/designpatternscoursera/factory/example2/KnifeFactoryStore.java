package com.example.designpatternscoursera.factory.example2;

import com.example.designpatternscoursera.factory.model.Knife;

public class KnifeFactoryStore {

    // Coding to an interface, not an implementation
    private final KnifeFactory factory;

    public KnifeFactoryStore(KnifeFactory factory) { // pass in a factory here
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {

        // Create knife using method in factory
        Knife knife = factory.createKnife(knifeType);

        // Prepare the knife
        knife.sharpen();;
        knife.polish();
        knife.pack_age();

        return knife;
    }
}
