package ru.mirea.task3.Book;

public class Book {
    private String author;
    private String title;
    private int  year;

    public Book(String author, String title, int year)
    {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {

        return title;
    }
    public void setTitle(String title)
    {

        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return String.format("\nAuthor: = %s\nTitle = %s\nYear = %d", getAuthor(), getTitle(), getYear()); }
}
