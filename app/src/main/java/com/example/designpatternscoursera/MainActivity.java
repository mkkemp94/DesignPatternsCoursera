package com.example.designpatternscoursera;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.designpatternscoursera.adapter.WebClient;
import com.example.designpatternscoursera.adapter.ouradapter.WebAdapter;
import com.example.designpatternscoursera.adapter.thirdparty.WebService;
import com.example.designpatternscoursera.composite.Housing;
import com.example.designpatternscoursera.composite.Room;
import com.example.designpatternscoursera.facade.BankService;
import com.example.designpatternscoursera.factory.example1.SimpleKnifeStore;
import com.example.designpatternscoursera.factory.example2.KnifeFactory;
import com.example.designpatternscoursera.factory.example2.KnifeFactoryStore;
import com.example.designpatternscoursera.factory.example3.BudgetKnifeStore;
import com.example.designpatternscoursera.factory.model.Knife;
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

        createExampleAdapter();

        createExampleComposite();
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

    //region adapter

    public void createExampleAdapter() {
        String webHost = "Host: https://google.com\n\r";
        WebService service = new WebService(webHost);

        WebAdapter adapter = new WebAdapter();
        adapter.connect(service);

        WebClient client = new WebClient(adapter);
        client.doWork();
    }

    //endregion

    //region composite

    private void createExampleComposite() {

        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First Floor");

        int firstFloor = building.addStructure(floor1);

        Room washroom1M = new Room("1F Men's Washroom");
        Room washroom1F = new Room("1F Women's Washroom");
        Room common1 = new Room("1F Common Area");

        int firstMens = floor1.addStructure(washroom1M);
        int firstWomans = floor1.addStructure(washroom1F);
        int firstCommon = floor1.addStructure(common1);

        building.enter();
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter();;
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentFloor.enter();

        building.exit();
    }

    //endregion
}