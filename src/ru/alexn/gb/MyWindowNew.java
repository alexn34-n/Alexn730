package ru.alexn.gb;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyWindowNew extends JFrame
{
    MyWindowNew()
    {
        setVisible(true);

        setLocation(350,300);
        setSize(350,300);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Window");

        JPanel panel= new JPanel(new GridLayout(1,2));

        JButton btn1= new JButton("Выход");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        panel.add(btn1);

        JButton btn2= new JButton("Новое окно");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                MyWindow w= new MyWindow();
            }
        });

        panel.add(btn2);

        add(panel,BorderLayout.SOUTH);



    }

}
