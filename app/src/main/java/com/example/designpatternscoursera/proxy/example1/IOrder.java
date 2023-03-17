package com.example.designpatternscoursera.proxy.example1;

import com.example.designpatternscoursera.proxy.example1.model.Order;

// Subject interface
public interface IOrder {
    void fulfillOrder(Order order);
}
