package ru.mirea.task28;

public class TestP {
    public static void main(String[] args) {
    AbletoTreat abletoTreat = new AbletoTreat() {
        @Override
        public void treat() {
            System.out.println("Someone is treating...");
        }
    };
    abletoTreat.treat();
    }
}
/*
Создается класс, который наследуется или реализует матоды AbletoTreat, и в котором мы можем
переопределить или реализовать методы этого интерфейса. И объекты этого класса присваиваются
интерфейсу.
То есть, этот объект класса, создается на один раз, на одно использование.
 */