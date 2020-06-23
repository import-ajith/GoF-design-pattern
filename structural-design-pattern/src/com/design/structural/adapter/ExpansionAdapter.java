package com.design.structural.adapter;

public class ExpansionAdapter  implements Socket {


    @Override
    public String getInput() {
        String input=new Plug().getSpecification();
        input=input+"power converted to 2-Pin";
        return input;
    }
}
