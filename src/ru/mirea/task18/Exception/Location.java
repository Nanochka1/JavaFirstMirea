package ru.mirea.task18.Exception;

import java.util.*;

class LocationException extends Exception
{
    public String toString()
    {
        return("Изменение в локации");
    }
}
public class Location {
    static void checkLocation(String loc1,String loc2) throws LocationException
    {
        if(!loc1.equalsIgnoreCase(loc2))
            throw new LocationException();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите первую локацию 1 : ");
        String l1=sc.next();
        System.out.println("Введите вторую локацию 2 : ");
        String l2=sc.next();
        try
        {
            checkLocation(l1,l2);
        }
        catch(LocationException e)
        {
            System.out.println(e.toString());
            System.out.println("Вероятность одинаковой цены на услуги в обеих локациях");
            l1=l2;
            System.out.println("Новая локация - локация 1: "+l1+" локация 2: "+l2);
        }


    }

}
