package ru.mirea.task11.opt3;

import javax.swing.*;
import java.awt.*;

import java.awt.event.*;



public class Mouse extends Frame implements WindowListener,ActionListener {



    Button b1,b2,b3,b4,b5;



    public Mouse(String title) {



        super(title);

        setLayout(new BorderLayout());

        addWindowListener(this);


        b1 = new Button("North");

        add(b1, BorderLayout.NORTH);

        b1.addActionListener(this);




        b2 = new Button("West");

        add(b2, BorderLayout.WEST);

        b2.addActionListener(this);




        b3 = new Button("Center");

        add(b3, BorderLayout.CENTER);

        b3.addActionListener(this);




        b4 = new Button("East");

        add(b4, BorderLayout.EAST);

        b4.addActionListener(this);




        b5 = new Button("South");

        add(b5, BorderLayout.SOUTH);

        b5.addActionListener(this);


    }



    public void actionPerformed(ActionEvent e){
        remove((Component)e.getSource());
        JOptionPane.showMessageDialog(b1, "Welcome to the North!");
        System.exit(0);
        JOptionPane.showMessageDialog(b2, "Welcome to the West!");
        System.exit(0);
        JOptionPane.showMessageDialog(b3, "Welcome to the Centre!");
        System.exit(0);
        JOptionPane.showMessageDialog(b4, "Welcome to the East!");
        System.exit(0);
        JOptionPane.showMessageDialog(b5, "Welcome to the South!");
        System.exit(0);


        validate();

    }



    public static void main(String[] args) {



       Mouse myWindow = new Mouse("Mouse");

        myWindow.setSize(300,250);

        myWindow.setVisible(true);



    }





    public void windowActivated(WindowEvent arg0) {

    }



    public void windowClosed(WindowEvent arg0) {

    }



    public void windowClosing(WindowEvent arg0) {

        dispose();

        System.exit(0);

    }



    public void windowDeactivated(WindowEvent arg0) {

    }



    public void windowDeiconified(WindowEvent arg0) {

    }



    public void windowIconified(WindowEvent arg0) {

    }



    public void windowOpened(WindowEvent arg0) {

    }



}