package com.design.creational.factory;


/**
 * Factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating
 * objects without having to specify the exact class of the object that will be created.
 *
 * @author Ajithlal
 * */
public class FactoryTest {

    public static void main(String[] args) {
        MobileFactory factory=new MobileFactory();
        Mobile mobile1=factory.getCall("Iphone");
        Mobile mobile2=factory.getCall("android");

        mobile1.Call();
        mobile2.Call();
    }
}
