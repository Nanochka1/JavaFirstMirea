package ru.mirea.task13.opt2;

/*
 АЛГОРИТМ


Шаг 1. Создайте двусвязный список, в котором каждый узел содержит только один
 символ строки.
Шаг 2: Инициализируйте два указателя слева в начале списка и справа в
 в конце списка.
Шаг 3: Проверьте, что данные в левом узле равны правому узлу, если они равны
 затем увеличивайте влево и уменьшайте вправо до середины списка
Шаг 4: Если на каком-либо этапе он не равен, верните значение false.
Шаг 5: Если возвращаемое логическое значение равно true, то данная строка является палиндромом
Шаг 6: Иначе введенная строка не является палиндромом

*/

import java.util.*;

 public class LinkedList
         {
             static String inputWord;
             static String inputWords;
             static int length;
             static boolean flag;


        // Creating class to represent each node of a doubly linked list
        static class Node
        {
        char value;
        Node next;
        Node previous;

        };

// Reference pointer
static Node headNode = new Node();


// Funtion to insert each character of the string into each node of doubly Linked list
public static  void insert(char v)
        {
        // Creating a new node of doubly linked list
        Node newNode = new Node();
        Node temp = new Node();

        // if the doubly linked list is empty
        if (headNode == null) {

        newNode.next = null;
        newNode.value = v;
        headNode = newNode;
        newNode.previous = null;
        }
        // each node contains only one character of a string.

        else {
        temp = headNode;
        // Traversing till the last node of the doubly linked list
        while (temp.next != null)
        {
        temp = temp.next;
        }

        // Inserting new node at the end of the doubly linked list

        newNode.value = v;
        temp.next = newNode;
        newNode.previous = temp;
        newNode.next = null;

        }
        }

// Function to check if list is palindrome or not
public static boolean reverse()
        {

        Node left = new Node();
        Node right = new Node();

        // Initialize pointer left to starting of list
        left = headNode;
        right = headNode;

        if (headNode == null)
        {
        return true;
        }

        // Traversing till the end of the list is reached

        while (right.next != null)
        {
        // Initialize pointer right to end of list
        right = right.next;

        }

        // Check the data at left node is equal to right node,
        // if it is equal then increment left and decrement right till middle of the list
        // If at any stage it is not equal then return false.

        while (left != right && right != left.previous)
        {
        if (left.value != right.value)
        return false;

        left = left.next;
        right = right.previous;

        }

        return true;
        }

public static void main(String[] args)
        {
        //  Setting  headNode (pointer to pointer) to null
        headNode = null;

        // Creating Scanner Object to read input from user
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the string");
        // Reading the string from the user
        inputWords = s.next();

        //Converting the string to lowercase if there mixed Casing is present
        inputWord = inputWords.toLowerCase();

        //Calculating the length of the string
        length = inputWord.length();

        //  Converting the given string into array of characters
        char[] inputWordArray = inputWord.toCharArray();

        for (int i = 0; i < length; i++)
        {
        // Funtion to insert each character of the string into each node of doubly
        // Linked list
        insert(inputWordArray[i]);
        }

        // Function call to check whether the given string is palindrome
        flag = reverse();

        if (flag == false)
        {
        System.out.printf("%s is not palindrome", inputWords);
        }

        else
        {
        System.out.printf("%s is palindrome", inputWords);
        }

        // Printing new Line
        System.out.println();

        // Closing the scanner Object
        s.close();

        }
        }


/*
 * ТЕСТОВЫЕ ПРИМЕРЫ
 *
 * Введите строку
 * Малаялам
 * Малаялам - это палиндром
 *
 *
 * Введите строку
 * Утро
 * Утро-это не палиндром
 *
 * Введите строку
 * ротор
 * ротор-это палиндром
 *
 */

/*
 * СЛОЖНОСТЬ
 *
 * Временная сложность : O(n)
 * Сложность пространства : O(1)
 *
 *
 */