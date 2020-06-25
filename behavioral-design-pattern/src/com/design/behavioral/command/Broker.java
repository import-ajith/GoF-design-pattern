package com.design.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orders=new ArrayList<>();

    public void takeOrder(Order order){
        orders.add(order);
    }

     public void performOrders(){
        for (Order order:orders) {
            order.execute();
        }
    }
}
