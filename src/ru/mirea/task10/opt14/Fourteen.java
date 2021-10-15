package ru.mirea.task10.opt14;

public class Fourteen {
    public static String recursion(int n) {
        // Базовый случай
        if (n < 10) {
            return Integer.toString(n);
        } // Шаг рекурсии / рекурсивное условие
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(123456789)); // вызов рекурсивной функции
    }
}

