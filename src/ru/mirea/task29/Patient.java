package ru.mirea.task29;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Patient implements Serializable {

    private static final long serialVersionUID = 1L;
    private final String name;
    private double price;
    private final Date operationDay;

    public Patient(String name, double price, int year, int month, int day) {
        this.name = name;
        this.price = price;
        this.operationDay = new GregorianCalendar(year, month - 1, day).getTime();
    }

    public void raisePrice(double byPercent) {
        double raise = price * byPercent / 100;
        price += raise;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[\nname = " + name + ",\nprice per operation = " + price + ",\noperationDay = " + operationDay + "]";
    }

}