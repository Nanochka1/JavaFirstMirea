package ru.mirea.task8.opt3.SnakeGame;

import javax.swing.*;

public class MainWindow extends JFrame {//реализуются основные настройки, создание окна, и где оно будет
    public MainWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());//добавление игрового поля
        setVisible(true);
    }
    public static void main(String[] args){
        MainWindow mw = new MainWindow();
    }
}
