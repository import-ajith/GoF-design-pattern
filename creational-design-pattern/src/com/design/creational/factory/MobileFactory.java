package com.design.creational.factory;

public class MobileFactory {

    public Mobile getCall(String mobile){
        if ("Android".equalsIgnoreCase(mobile)){
                return new Android();
        }else if ("Iphone".equalsIgnoreCase(mobile)){
            return new Iphone();
        }
        return null;
    }
}
