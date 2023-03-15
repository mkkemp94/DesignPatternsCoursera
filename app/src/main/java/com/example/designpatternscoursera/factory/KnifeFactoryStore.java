package com.example.designpatternscoursera.factory;

import com.example.designpatternscoursera.factory.model.Knife;

public class KnifeFactoryStore {

    private KnifeFactory factory;

    public KnifeFactoryStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {

        // Create knife
        Knife knife = factory.createKnife(knifeType);

        // Prepare the knife
        knife.sharpen();;
        knife.polish();
        knife.pack_age();

        return knife;
    }
}
