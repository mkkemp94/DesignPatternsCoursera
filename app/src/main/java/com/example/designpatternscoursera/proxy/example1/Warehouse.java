package com.example.designpatternscoursera.proxy.example1;

import com.example.designpatternscoursera.proxy.example1.model.Item;
import com.example.designpatternscoursera.proxy.example1.model.Order;

import java.util.HashMap;

// Real Subject class
// Client does not interact with is
public class Warehouse {

    private HashMap<String, Integer> stock;
    private String address;

    public Warehouse(final String address) {
        this.stock = new HashMap<>();
        this.address = address;
    }

    public void fulfillOrder(Order order) {
        for (Item item : order.itemList)
            this.stock.replace(item.sku, stock.get(item) - 1);

        // Then process the order for shipment and delivery
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.sku))
            return stock.get(item.sku).intValue();
        return 0;
    }
}
