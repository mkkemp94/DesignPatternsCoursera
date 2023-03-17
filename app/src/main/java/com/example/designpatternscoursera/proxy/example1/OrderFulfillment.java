package com.example.designpatternscoursera.proxy.example1;

import com.example.designpatternscoursera.proxy.example1.model.Item;
import com.example.designpatternscoursera.proxy.example1.model.Order;

import java.util.List;

// Proxy class .. Delegates to Real Subject -- Warehouse
// Client interacts with this
public class OrderFulfillment implements IOrder {

    private List<Warehouse> warehouses;

    @Override
    public void fulfillOrder(final Order order) {

        // For each item in customer order, check each warehouse to see if it is in stock
        // If it is, create a new Order for that warehouse.
        // Else check the next warehouse.
        // Send all the Orders to the warehouse(s) after you finish iterating over the items in the original Order
        for (Item item : order.itemList) {
            for (Warehouse warehouse : warehouses){
                // ...
                if (warehouse.currentInventory(item) > 0) {
                    // Mark this warehouse as the one to get the item
                }
            }

            // Now order the items from the warehouses
        }
        return;
    }
}
