package ru.mirea.task4.Ball;

public class Balltest {
    public static void main(String[] args) {
        Ball b1 = new Ball(500, 90);
        Ball b2 = new Ball(30, 70);
        Ball b3 = new Ball(125, 15);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        b1.move(13, 9);
        b2.move(55, 73);
        b3.move(28, 36);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
