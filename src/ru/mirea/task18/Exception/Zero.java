package ru.mirea.task18.Exception;

import java.util.Scanner;

class ZeroException extends Exception
{
    public String toString()
    {
        return("Деление на ноль - ОШИБКА");
    }
}
public class Zero {
    static void checkDenominator(float d) throws ZeroException
    {
        if(d==0.0f)
            throw new ZeroException();
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Введите числитель :");
        float num=sc.nextFloat();
        System.out.println("Введите знаменатель :");
        float den=sc.nextFloat();
        try
        {
            checkDenominator(den);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        float result=num/den;
        System.out.println("Результат = "+result);
    }

}