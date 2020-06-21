package com.design.creational.prototype;

/**
 * Prototype pattern refers to creating duplicate object while keeping performance in mind.
 * @author Ajithlal
 * */

public class PrototypeTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs=new BookShop();
        bs.setShopName("Book shop-1");
        bs.loadData();
        System.out.println(bs);


        BookShop bs1=(BookShop)bs.clone(); //shallow cloning,processing time is reduced
        bs1.setShopName("Book shop-2");
        System.out.println(bs1);



    }
}
