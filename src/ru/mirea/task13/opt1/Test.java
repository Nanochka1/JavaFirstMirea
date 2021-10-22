package ru.mirea.task13.opt1;

import ru.mirea.task13.opt1.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(8);
        for(int i = 0; i<20;i++)
            ints.add(i);
        System.out.println(ints);
        for(int i = 5; i < 13; i++)
            ints.remove(i);
        System.out.println(ints);
        System.out.println(ints.get(5));
        System.out.println();

        ArrayList<String> strs = new ArrayList<>();
        System.out.println(strs);
        for (int i = 0; i < 10; i++) {
            strs.add("String number " + (i+1));
        }
        System.out.println(strs);
        System.out.println();

        ArrayList<String> strs2 = new ArrayList<>(strs);
        System.out.println(strs2);
        strs2.remove(5);
        System.out.println(strs2.get(5));
        System.out.println(strs.get(5));
        strs2.addAll(strs2.getCount(), strs.subList(4, 8));
        System.out.println(strs2);
        strs2.sort(String::compareTo);
        System.out.println(strs2);
    }
}