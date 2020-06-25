package com.design.behavioral.cor;

public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level){
        this.level=level;
    }


    @Override
    protected void write(String message) {
        System.out.println("Error Console : Logger "+message);
    }

    @Override
    public String toString() {
        return "ErrorLogger{" +
                "level=" + level +
                ", nextLogger=" + nextLogger +
                '}';
    }
}
