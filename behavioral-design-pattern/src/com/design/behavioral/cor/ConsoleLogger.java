package com.design.behavioral.cor;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level=level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Standard Console : Logger "+message);
     }

    @Override
    public String toString() {
        return "ConsoleLogger{" +
                "level=" + level +
                ", nextLogger=" + nextLogger +
                '}';
    }
}
