package ru.mirea.task23;

public class Program {

    public static void main(String[] args) {

        String s1 = "Test";
        String s2 = "Test";

        Client c1 = new Client("Anastasia", "nana@gmail.com");
        Client c2 = new Client("Monica", "monya@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));  // сравнение
        System.out.println(c1 == c2); // также сравнение ссылки на память при создании экземпляра

        System.out.println(s1 == s2); // не создан экземпляр
    }

}

/*
Выходные данные
599280361
-1407390601
false
false
true
 */