package com.design.creational.builder;

public class Email {
    private String title;
    private String recipients;
    private String message;

    public Email(String title, String recipients, String message) {
        this.title = title;
        this.recipients = recipients;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getRecipients() {
        return recipients;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Email{" +
                "title='" + title + '\'' +
                ", recipients='" + recipients + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
