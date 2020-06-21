package com.design.creational.builder;

import java.util.HashSet;
import java.util.Set;

public class EmailBuilder {

    private String title;
    private Set recipients = new HashSet();
    private String message;



    public EmailBuilder setTitle(String title) {
        this.title = title;
        return this;
    }

    public EmailBuilder addRecipients(String recipient) {
        this.recipients.add(recipient);
        return this;
    }

    public EmailBuilder removeRecipients(String recipient){
        this.recipients.remove(recipient);
        return this;
    }

    public EmailBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public Email build() {
        String recipientSection = getReceipientsString();
        return new Email(title,recipientSection,message); //return Email object
    }


    private String getReceipientsString() {
        StringBuilder sb = new StringBuilder();
        for(Object rt:recipients) {
            sb.append(",").append(rt);
        }
        return sb.toString().replaceFirst(",","");
    }
}
