package ru.mirea.task1.opt4;

import java.util.*;

public class Sort {
        public static void main(String[] args) {
            int a = -1000; // Начальное значение диапазона, с какого значения он начинается
            int b = 1000; // Конечное значение диапазона, до какого значения идет

            int [] arr = new int[7];
            int i=0;

            while (i <6){
                arr[i] = a + (int) (Math.random() * b);
                i++;
            }

            Random r  = new Random();

            while (i < 6){
                arr[i] = r.nextInt();
                i++;
            }

            System.out.print("\nМассив из случайных чисел:");

            for (int j=0; j < 6; j++){
                System.out.print(" " + arr[j]);
            }

            Arrays.sort(arr);

            System.out.print("\nОтсортированный массив:");
            for (int j=0; j < 6; j++){
                System.out.print(" " + arr[j]);
            }
        }
    }
