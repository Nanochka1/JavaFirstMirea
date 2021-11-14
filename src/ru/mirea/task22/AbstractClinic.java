package ru.mirea.task22;

abstract class AbstractClinic {

    private int checkup;
    private int price;

    public AbstractClinic(int checkup, int price) {
        this.checkup = checkup;
        this.price = price;
    }

    public int getCheckup() {
        return checkup;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Количество обследований = " + this.getCheckup() + "\t| Цена = " + this.getPrice() + " рублей";
    }
}