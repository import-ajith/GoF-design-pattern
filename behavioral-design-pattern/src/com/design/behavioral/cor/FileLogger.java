package com.design.behavioral.cor;



public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level=level;
    }



    @Override
    protected void write(String message) {
        System.out.println("File Console : Logger "+message);
    }

    @Override
    public String toString() {
        return "FileLogger{" +
                "level=" + level +
                ", nextLogger=" + nextLogger +
                '}';
    }
}
