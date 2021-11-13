package ru.mirea.task18.Exception;

import java.util.*;

class Patient
{
    public String name;
    public int age;
    Patient(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void display()
    {
        System.out.println("Пациент : ");
        System.out.println("Имя : "+name);
        System.out.println("Возраст : "+age);
    }

}
class NameException extends Exception
{
    public String  toString()
    {
        return("Имя введено не корректно");
    }
}
class AgeException extends Exception
{	public String toString()
{
    return("Возраст введен не корректно");
}
}
public class Name {

    public static void checkname(String name) throws NameException
    {
        char[] namearray=name.toCharArray();
        for(int i=0;i<name.length();i++)
        {
            if(Character.isDigit(namearray[i]))
                throw new NameException();
        }
    }
    public static void checkage(int age) throws AgeException
    {
        if(age>50)
        {
            throw new AgeException();
        }
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите имя  :");
        String nameinput=sc.nextLine();
        System.out.println("Введите возраст : ");
        int ageinput=sc.nextInt();
        try
        {
            checkname(nameinput);
            try
            {
                checkage(ageinput);
            }
            catch(AgeException e)
            {
                System.out.println(e.toString());
            }

        }
        catch(NameException n)
        {
            System.out.println(n.toString());
        }
        Patient pat=new Patient(nameinput,ageinput);
        pat.display();

    }

}