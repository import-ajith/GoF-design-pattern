package com.design.creational.builder;


/**
 * The builder pattern is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming.
 * The intent of the Builder design pattern is to separate the construction of a complex object from its representation
 * @author Ajithlal
 * */
public class BuilderTest {

    public static void main(String[] args) {
        EmailBuilder eb=new EmailBuilder();
         Email email=eb.setMessage("Hi,This is Message content")
                 .addRecipients("Ajith")
                 .addRecipients("Vinay")
                 .setTitle("Design Pattern")
                 .build();

        System.out.println("Email  : "+email);
    }
}
