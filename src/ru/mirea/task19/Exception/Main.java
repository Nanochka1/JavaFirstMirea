package ru.mirea.task19.Exception;

public class Main {
    int x = 6;

    public static void test() throws MyException {
        try {
            int v = Integer.parseInt("ABC");
            System.out.println(v);
        } catch (RuntimeException e) {
            System.out.println("Найдено исключение");
            throw new MyException(e.getMessage() + "\n" + e.getLocalizedMessage());
        } finally {
            System.out.println("Программа работает");
        }

    }

    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println(e.serialVersionUID);
            e.printStackTrace();
        }
    }
}