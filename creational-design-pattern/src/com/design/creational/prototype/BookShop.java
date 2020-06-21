package com.design.creational.prototype;

import java.util.ArrayList;
import java.util.List;


/**
 *  clone() method saves the extra processing task for creating the exact copy of an object.
 *  Object.clone() supports only shallow copying but we will need to override it if we need deep cloning.
 * @author Ajithlal
 * */
public class BookShop implements Cloneable{

    private List<Book> books=new ArrayList<>();
    private String shopName;


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void loadData(){
        for (int i = 0; i < 5; i++) {
            Book b=new Book();
            b.setBookId(i);
            b.setBookName("Book "+i);
            getBooks().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "books=" + books +
                ", shopName='" + shopName + '\'' +
                '}';
    }
}
