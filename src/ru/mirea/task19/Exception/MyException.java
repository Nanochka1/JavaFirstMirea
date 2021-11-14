package ru.mirea.task19.Exception;

public class MyException extends Exception{
    public static final long serialVersionUID =123456789;
    public MyException(String message) {
        super(message);
    }
}