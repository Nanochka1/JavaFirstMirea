package ru.mirea.task11.opt2;

import javax.swing.*;
import java.awt.Font;

    public class JTextArea extends JFrame
    {
        public JTextArea()
        {
            super("JTextArea");
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            // Cоздание многострочных полей
            javax.swing.JTextArea area1 = new javax.swing.JTextArea("Многострочное поле", 8, 10);
            // Шрифт и табуляция
            area1.setFont(new Font("Dialog", Font.PLAIN, 14));
            area1.setTabSize(10);
            area1.setLineWrap(true);
            area1.setWrapStyleWord(true);

            javax.swing.JTextArea area2 = new javax.swing.JTextArea(8, 10);
            area2.setText("Второе многострочное поле");
            area2.setFont(new Font("Dialog", Font.ITALIC, 14));
            area2.setTabSize(10);
            // Параметры переноса слов
            area2.setLineWrap(true);
            area2.setWrapStyleWord(true);

            javax.swing.JTextArea area3 = new javax.swing.JTextArea(8, 10);
            area3.setText("Третье многострочное поле");
            area3.setFont(new Font("Dialog", Font.BOLD, 14));
            area3.setTabSize(10);
            // Параметры переноса слов
            area3.setLineWrap(true);
            area3.setWrapStyleWord(true);

            // Добавим поля в окно
            JPanel contents = new JPanel();
            contents.add(new JScrollPane(area1));
            contents.add(new JScrollPane(area2));
            contents.add(new JScrollPane(area3));
            setContentPane(contents);

            // Выводим окно на экран
            setSize(400, 300);
            setVisible(true);
        }
        public static void main(String[] args) {
            new JTextArea();
        }
    }
