package ru.mirea.task2.book;
import java.lang.*;

public class Book {
        private int page;
        private String author;
        public Book( int p,String a)
        {
            page = p;
            author = a;
        }
        public Book()
        {
            page = 0;
            author = "Null";
        }
        public void setPage(int page)
        {
            this.page = page;
        }
        public void setAuthor(String Author)
        {
            this.author = author;
        }
        public int getPage()
        {
            return page;
        }
        @Override
        public String toString()
        {
            return this.author + ", the author of the book with the number of pages " + this.page;
        }
        public void BookAuthor()
        {
            System.out.println(author+" the author of the book with the number of pages "+ page);
        }
    }
