package ru.mirea.task1.opt5;

public class factorial {
    static long fac(int n)
    {
        long l = 1;
        for (int i=2; i <= n; i++)
        {
            l *= i;
        }
        return l;
    }
    public static void main(String[] args)
    {
        int n = 13;//факториал = 6227020800
        System.out.println(fac(n));
    }
}

