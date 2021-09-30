package ru.mirea.task1.opt1;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int [] a = new int[]{10,1,3,9,5,10,13,9}; // Сумма = 60
        int sum = 0;

        for (int i=0; i < 8; i++)
        {  // Сумма через for
            sum += a[i];
        }
        System.out.println("Sum(for):" + sum);

        sum =0;
        int i=0;
        while (i < 8)
        {  // Сумма через while
            sum += a[i];
            i++;
        }
        System.out.println("Sum(while):" + sum);

        sum =0;
        i=0;
        do
        {  // Сумма через do while
            sum += a[i];
            i++;
        }while(i < 8);
        System.out.println("Sum(do while):" + sum);

    }
}

