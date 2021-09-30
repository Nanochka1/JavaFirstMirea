package ru.mirea.task2.ball;
import java.lang.*;


public class Balltest {
    public static void main(String[] args)
    {
        Ball hm1 = new Ball(20,"pink");
        Ball hm2 = new Ball(100,"white");
        System.out.println(hm1);
        System.out.println(hm2);
        hm1.BallSize();
        hm2.BallSize();

    }
}