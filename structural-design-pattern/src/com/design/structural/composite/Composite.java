package com.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    String name;
    List<Component> composites=new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComposite(Component component){
        composites.add(component);
    }

    @Override
    public void showPrice() {
        System.out.println(name);
        for(Component component:composites){
            component.showPrice();
        }
    }
}
