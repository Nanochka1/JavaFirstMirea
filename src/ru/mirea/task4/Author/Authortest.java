package ru.mirea.task4.Author;

public class Authortest {
    public static void main(String[] args)
    {
        Author A1 = new Author("Anna", "annushka95@gmail.com", 'F');
        Author A2 = new Author("Elizabeth", "zizi2005@mail.ru", 'F');
        Author A3 = new Author("Alexandra", "sashulya2506@gmail.ru", 'F');
        Author A4 = new Author("Mikhail" , "misha0605@mail.com", 'M');
        Author A5 = new Author("Vladimir", "vova.designer@gmail.ru", 'M');
        System.out.println(A1);
        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5);
    }
}

