package ru.mirea.task17.Base;

enum Basa3 {
    Age, Doctors, Examination, Place
}

class EnumDemo3 {
    public static void main(String[] args) {
        ru.mirea.task17.Base.Basa3 bas1, bas2, bas3;

        System.out.println("Получить все константы и порядковые значения:");

        for (ru.mirea.task17.Base.Basa3 b : ru.mirea.task17.Base.Basa3.values()) {
            System.out.println(b + " " + b.ordinal());
        }

        bas1 = Basa3.Age;
        bas2 = Basa3.Doctors;
        bas3 = Basa3.Examination;

        System.out.println("\nПродемонстрировать применение метода compareTo():");
        if (bas1.compareTo(bas2) < 0) System.out.println(bas1 + " предшествует " + bas2);
        if (bas1.compareTo(bas2) > 0) System.out.println(bas2 + " предшествует " + bas1);
        if (bas1.compareTo(bas3) == 0) System.out.println(bas1 + " равно " + bas3);

        System.out.println("\nПродемонстрировать применение метода equals():");
        if (bas1.equals(bas2)) System.out.println("Ошибка!");
        if (bas1.equals(bas3)) System.out.println(bas1 + " равно " + bas3);

        System.out.println("\nСравнить на равенство:");
        if (bas1 == bas3) System.out.println(bas1 + " == " + bas3);
    }
}