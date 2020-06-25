package com.design.behavioral.observer;

public class Subscriber {
    private String name;
    private Channel channel;//One channel only subscriber can subscriber

    public Subscriber(String name) {
        this.name = name;
    }

    public void subscribeChannel(Channel ch){ //Subscribers wants to know which channel subscribed
        this.channel=ch;
    }

    public void update(String msg){
        System.out.println("Hey "+name +"! "+msg+ " Video Uploaded !!!");
    }
}
