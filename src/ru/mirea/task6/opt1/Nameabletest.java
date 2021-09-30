package ru.mirea.task6.opt1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Nameabletest {
    public static void main(String[] args) {
        Entity b1 = new Entity("Voice assistant", "ALISA");
        Entity b2 = new Entity("Planet", "MARS");
        b1.print();
        b2.print();
        System.out.println(b1);
        System.out.println(b2);
        Name a1 = new Name("ALISA");
        Name a2 = new Name("MARS");
        a1.print();
        a2.print();
        System.out.println(a1);
        System.out.println(a2);


    }
}

