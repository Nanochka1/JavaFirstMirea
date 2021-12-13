package ru.mirea.task29;

public class Doctor extends Patient {

    private static final long serialVersionUID = 1L;
    private Patient sick;

    public Doctor(String name, double price, int year, int month, int day) {
        super(name, price, year, month, day);
        this.sick = null;
    }

    public void setSick(Patient sick) {
        this.sick = sick;
    }

    @Override
    public String toString() {
        return super.toString() + "[\nsick = " + sick + "]";
    }

}