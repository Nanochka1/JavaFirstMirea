package ru.mirea.task2.dog;
import java.lang.*;

public class Dog
{
    private String name;
    private String species;
    private int age;
    private String owner;

    public Dog(String n, int a, String s, String o) {
        name = n;
        age = a;
        species = s;
        owner = o;
    }

    public Dog(String n, String s, String o) {
        name = n;
        age = 0;
        species = s;
        owner = o;
    }

    public Dog() {
        name = "Null";
        age = 0;
        species = "Null";
        owner = "Null";
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name) {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies(String species) {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {return owner;}

    public void setOwner(String owner) {this.owner = owner;}

    public String toString() {
        return this.name + ", age " + this.age + ", species " + this.species + ", owner " + this.owner;
    }

    public void HumanAge() {
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }
}
