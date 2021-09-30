package ru.mirea.task8.opt2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JComponent implements KeyListener, ActionListener {
    Image pic = new ImageIcon("src/ru/mirea/task8/opt2/картинка.jpg").getImage();

    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(pic, 0, 0, null);
    }


    public static void main(String[] args){//то, что связано с нашим окошком
        Main t = new Main();
        JFrame f = new JFrame("picture");
        f.setSize(600,600);//размеры
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//выход по закрытию
        f.addKeyListener(t);
        f.add(new Main());
        f.add(t);//объект
        f.setVisible(true);//видимсоть
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
