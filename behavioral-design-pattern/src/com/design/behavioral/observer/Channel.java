package com.design.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    private List<Subscriber> subscribers=new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifyAllSubscribers(){
        for (Subscriber subscriber:subscribers) {
            subscriber.update(title);
        }
    }

    public void upload(String title){
       this.title=title;
       notifyAllSubscribers();
    }


}
