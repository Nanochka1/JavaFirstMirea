package ru.mirea.task12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        // создаем массив объектов
        Student[] stdArr = new Student[4];
        stdArr[0] = new Student(9, "Sasha", 21, 90);
        stdArr[1] = new Student(10, "Marina", 19, 80);
        stdArr[2] = new Student(5, "Lena", 20, 75);
        stdArr[3] = new Student(8, "Alex", 22, 85);

        // сортируем массив с помощью интерфейса Comparable
        Arrays.sort(stdArr);
        System.out.println("Стандартная сортировка по id:\n"+Arrays.toString(stdArr));

        // сортируем массив с помощью интерфейса Comparator по зарплате
        Arrays.sort(stdArr, Student.GPAComparator);
        System.out.println("Comparator по GPA:\n"+Arrays.toString(stdArr));

        //сортируем массив с помощью интерфейса Comparator по возрасту
        Arrays.sort(stdArr, Student.AgeComparator);
        System.out.println("Comparator по возрасту:\n"+Arrays.toString(stdArr));

        // сортируем массив с помощью интерфейса Comparator по имени
        Arrays.sort(stdArr, Student.NameComparator);
        System.out.println(" Comparator по имени:\n"+Arrays.toString(stdArr));

    }
    }
    class Student implements Comparable<Student> {

        private int id;
        private String name;
        private int age;
        private int GPA;

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getGPA() {
            return GPA;
        }

        public Student(int id, String name, int age, int GPA) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.GPA = GPA;
        }

        @Override
        public int compareTo(Student std) {
            //давайте будем сортировать объекты Student по значению поля id от меньшего к большему
            //будем возвращать отрицательное число, 0 или положительное число по каждому сравнению объектов
            // здесь мы просто отнимаем значение поля одного объекта от значения поля другого объекта
            // в результате получим 1 из 3 вариантов описанных выше вариантов
            return (this.id - std.id);
        }

        @Override
        // переопределяем метод таким образом, чтобы
        // он возвращаем информацию об объекте в читабельном виде
        public String toString() {
            return "[id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", GPA=" + this.GPA + "]";
        }

        //Comparator для сортировки списка или массива объектов по зарплате
        public static Comparator<Student> GPAComparator = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return (int) (s2.getGPA() - s1.getGPA());
            }
        };

        //Comparator для сортировки списка или массива объектов по возрасту
        public static Comparator<Student> AgeComparator = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge();
            }
        };

        //Comparator для сортировки списка или массива объектов по имени
        public static Comparator<Student> NameComparator = new Comparator<Student>() {

            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        };
    }
    class CompByGPAAndName implements Comparator<Student> {

        @Override
        public int compare(Student s1, Student s2) {
            // отнимает id и получаем результат в переменную flag
            int flag = s1.getId() - s2.getId();

            // если получили 0, то сортируем по имени
            if(flag == 0) flag = s1.getName().compareTo(s2.getName());
            return flag;
        }
    }


