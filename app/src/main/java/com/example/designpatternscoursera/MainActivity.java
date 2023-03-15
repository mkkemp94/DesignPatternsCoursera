package com.example.designpatternscoursera;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpatternscoursera.factory.model.Knife;
import com.example.designpatternscoursera.factory.SimpleKnifeStore;
import com.example.designpatternscoursera.singleton.ExampleSingleton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleSingleton();
        createSimpleFactory();
    }


    //region singleton

    private void createExampleSingleton() {
        ExampleSingleton exampleSingleton = ExampleSingleton.getInstance();
    }

    //endregion

    //region factory

    private void createSimpleFactory() {

        SimpleKnifeStore knifeStore = new SimpleKnifeStore();
        Knife breadKnife = knifeStore.orderKnife("bread");
        breadKnife.polish();
    }


    //endregion
}