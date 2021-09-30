package ru.mirea.task3.Book;

public class Booktest {
    public static void main(String[] args)
    {
        Book A1 = new Book("Anna Smith", "Romeo", 2000);
        Book A2 = new Book("Elizabeth Pica", "Juliet", 2003);
        Book A3 = new Book("Alexandra Jojo", "Me before you", 2010);
        Book A4 = new Book("Mikhail Ham" , "The king", 1989);
        Book A5 = new Book("Vladimir Gogo", "The forever war", 1990);
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5);
    }
}
