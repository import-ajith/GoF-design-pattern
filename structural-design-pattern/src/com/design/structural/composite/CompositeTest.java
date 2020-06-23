package com.design.structural.composite;


/**
 * The composite pattern describes a group of objects that are treated the same way as a single instance
 * of the same type of object
 *
 * @author Ajithlal
 * */
public class CompositeTest {
    public static void main(String[] args) {
        Component hd= new Leaf("HDD","4000");
        Component mouse= new Leaf("Mouse","500");
        Component ram= new Leaf("RAM","5000");
        Component cpu= new Leaf("CPU","10000");
        Component monitor= new Leaf("Monitor","5000");

        Composite ph=new Composite("Peripheral");
        Composite cabinet=new Composite("Cabinet");
        Composite mb=new Composite("Mother Board");
        Composite computer=new Composite("Computer");

        mb.addComposite(ram);
        mb.addComposite(cpu);

        ph.addComposite(mouse);
        ph.addComposite(monitor);

        computer.addComposite(mb);
        computer.addComposite(ph);
        computer.showPrice();

    }
}
