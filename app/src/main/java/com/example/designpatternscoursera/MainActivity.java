package com.example.designpatternscoursera;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpatternscoursera.factory.example2.KnifeFactory;
import com.example.designpatternscoursera.factory.example2.KnifeFactoryStore;
import com.example.designpatternscoursera.factory.example3.BudgetKnifeStore;
import com.example.designpatternscoursera.factory.model.Knife;
import com.example.designpatternscoursera.factory.example1.SimpleKnifeStore;
import com.example.designpatternscoursera.singleton.ExampleSingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleSingleton();

        createExampleFactories();
    }


    //region singleton

    private void createExampleSingleton() {
        ExampleSingleton exampleSingleton = ExampleSingleton.getInstance();
    }

    //endregion

    //region factory

    private void createExampleFactories() {

        SimpleKnifeStore simpleStore = new SimpleKnifeStore();
        Knife breadKnife = simpleStore.orderKnife("bread");
        breadKnife.polish();

        KnifeFactory knifeFactory = new KnifeFactory(); // factory can be reused in multiple places
        KnifeFactoryStore factoryStore = new KnifeFactoryStore(knifeFactory);
        Knife paringKnife = factoryStore.orderKnife("paring");
        paringKnife.sharpen();

        BudgetKnifeStore subclassStore = new BudgetKnifeStore();
        Knife budgetSteakKnife = subclassStore.orderKnife("steak");
        budgetSteakKnife.pack_age();
    }


    //endregion
}