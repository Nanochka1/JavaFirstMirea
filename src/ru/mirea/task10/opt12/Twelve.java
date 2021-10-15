package ru.mirea.task10.opt12;
import java.util.Scanner;

public class Twelve {
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        int n = in.nextInt();

        // Базовый случай
        if (n > 0) {
            recursion();
            // Шаг рекурсии / рекурсивное условие
            if (n % 2 == 1) {
                System.out.println(n);
            }
        }

        else {
            if (n == 0){
            }
        }
    }
    public static void main(String[] args) {
        recursion(); // вызов рекурсивной функции
    }
}

