package com.design.structural.adapter;

/**
 * Adapter pattern works as a bridge between two incompatible interfaces.
 * This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.
 * @author Ajithlal
 * */
public class AdapterTest {
    public static void main(String[] args) {

        Socket socket =new ExpansionAdapter();
        System.out.println("Output  : "+socket.getInput());
    }

}
