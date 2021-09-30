package ru.mirea.task2.book;
import java.lang.*;

public class Booktest {
    public static void main(String[] args)
    {
        Book hm1 = new Book(369,"Hopkins");
        Book hm2 = new Book(55,"Smith");
        hm2.setPage(1);
        System.out.println(hm1);
        System.out.println(hm2);
        hm1.BookAuthor();
        hm2.BookAuthor();
    }
}
