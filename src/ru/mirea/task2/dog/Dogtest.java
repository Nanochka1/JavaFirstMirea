package ru.mirea.task2.dog;

import java.lang.*;

    public class Dogtest {
        public static void main(String[] args) {
            Dog dog1 = new Dog("Bobo",13 , "Maltese", "Anna");
            Dog dog2 = new Dog("Fafa", 5,"Labrador", "John");
            Dog dog3 = new Dog("Coco",9,"Beagle", "Monica");
            dog3.setAge(1);
            System.out.println(dog1);
            System.out.println(dog2);
            System.out.println(dog3);
            dog1.HumanAge();
            dog2.HumanAge();
            dog3.HumanAge();
        }
    }


