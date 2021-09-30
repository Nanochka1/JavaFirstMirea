package ru.mirea.task3.Human;
import java.lang.*;

public class humantest {
    public static void main(String[] args) {
        Human hm1 = new Human( "Anna", "2",1,"2");
        Human hm2 = new Human("Mark",  "2",1,"2");
        Human hm3 = new Human("Sophia","2",1,"2");
        hm3.setHead(1);
        System.out.println(hm1);
        System.out.println(hm2);
        System.out.println(hm3);
        hm1.HumanHead();
        hm2.HumanHead();
        hm3.HumanHead();
    }
}
