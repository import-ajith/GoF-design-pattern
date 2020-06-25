package com.design.behavioral.observer;


/**
 * The observer pattern is a software design pattern in which an object, called the subject,
 * maintains a list of its dependents, called observers, and notifies them automatically of any state changes,
 * usually by calling one of their methods.
 * @author Ajithlal
 * */
public class ObserverTest {

    public static void main(String[] args) {

        Subscriber s1=new Subscriber("Akshay");
        Subscriber s2=new Subscriber("Ajith");
        Subscriber s3=new Subscriber("Vinay");

        Channel youTube=new Channel();
        youTube.subscribe(s1);
        youTube.subscribe(s2);
        youTube.subscribe(s3);

        youTube.upload("Design Pattern");


    }
}
