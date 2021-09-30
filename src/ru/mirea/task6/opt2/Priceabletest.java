package ru.mirea.task6.opt2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Priceabletest {
    public static void main(String[] args) {
        Entity b1 = new Entity("Samsung", "Galaxy A80", 60000);
        Entity b2 = new Entity("Apple", "Iphone 13", 160000);
        b1.print();
        b2.print();
        System.out.println(b1);
        System.out.println(b2);
        Price a1 = new Price("60000");
        Price a2 = new Price("160000");
        a1.print();
        a2.print();
        System.out.println(a1);
        System.out.println(a2);


    }
}

