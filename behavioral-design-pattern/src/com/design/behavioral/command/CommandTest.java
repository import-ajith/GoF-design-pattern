package com.design.behavioral.command;


/**
 * command pattern is a behavioral design pattern in which an object is used to encapsulate
 * all information needed to perform an action or trigger an event at a later time
 * @author Ajithlal
 * */
public class CommandTest {
    public static void main(String[] args) {
        Stock stock=new Stock();
        BuyStock buyStock=new BuyStock(stock);
        SellStock sellStock=new SellStock(stock);

        Broker broker=new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.performOrders();


    }
}
