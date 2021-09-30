package ru.mirea.task6.opt1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public interface Nameable {
    void name();

}
class Entity implements Nameable {
    String entity;
    String name;
    Entity(String entity, String name){
        this.entity = entity;
        this.name = name;
    }

    public String toString()
    {
        return String.format("Сущность %s имеет имя  %s  \n",
                 entity, name);
    }


    @Override
    public void name() {

    }

    public void print() {
    }
}
class Name implements Nameable {
    private String name;


    String getName() {
        return name;
    }

    Name(String name) {

        this.name = name;
    }

    public String toString() {
        return String.format("Сущность имеет имя '%s'\n", name);
    }


    public void print() {
    }

    @Override
    public void name() {

    }
}
