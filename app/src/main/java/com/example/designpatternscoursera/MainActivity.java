package com.example.designpatternscoursera;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpatternscoursera.facade.BankService;
import com.example.designpatternscoursera.factory.example2.KnifeFactory;
import com.example.designpatternscoursera.factory.example2.KnifeFactoryStore;
import com.example.designpatternscoursera.factory.example3.BudgetKnifeStore;
import com.example.designpatternscoursera.factory.model.Knife;
import com.example.designpatternscoursera.factory.example1.SimpleKnifeStore;
import com.example.designpatternscoursera.singleton.ExampleSingleton;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createExampleSingleton();

        createExampleFactories();

        createExampleFacade();
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

    //region facade

    public void createExampleFacade() {

        BankService bankService = new BankService();

        int mySaving = bankService.createNewAccount("saving", new BigDecimal("500.00"));
        int myInvestment = bankService.createNewAccount("investment", new BigDecimal("1000.00"));

        bankService.transferMoney(mySaving, myInvestment, new BigDecimal("300.00"));

    }

    //endregion
}