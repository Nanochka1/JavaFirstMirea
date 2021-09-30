package ru.mirea.task6.opt2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public interface Priceable {
    void price();

    void print();
}
class Entity implements Priceable {
    String name;
    String product;
    int money;
    Entity(String name, String product, int money){
        this.name = name;
        this.product = product;
        this.money = money;
    }

    public String toString()
    {
        return String.format("Аппарат фирмы '%s', модель %s, стоит в этом году %d рублей \n",
                name, product, money);
    }


    @Override
    public void price() {
        
    }

    public void print() {
    }
}
 class Price implements Priceable {
    private String price;

    String getPrice(){
        return price;
    }

    Price(String price){

        this.price = price;
    }
    public String toString()
    {
        return String.format("Сущность стоит %s рублей", price);
    }

     @Override
     public void price() {
         
     }
     @Override
     public void print(){

     }
 }
