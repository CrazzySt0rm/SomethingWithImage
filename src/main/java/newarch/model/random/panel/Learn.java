package newarch.model.random.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Learn {

    public Learn learn() {

        //public static void main (String[]args){
        JFrame frame = new JFrame();
        frame.setTitle("Hello");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(2, 2));

        HelloActionListener listen = new HelloActionListener();
        HelloActionListener listenTwo = new HelloActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello Bro!");
            }
        };
        HelloActionListener listenThree = new HelloActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Привет Чувак!!!!!");
            }
        };
        HelloActionListener listenFour = new HelloActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Здарова");
            }
        };
        JButton b1 = new JButton("TOP");
        b1.addActionListener(listen);
        JButton b2 = new JButton("LEFT");
        b2.addActionListener(listenTwo);
        JButton b3 = new JButton("RIGHT");
        b3.addActionListener(listenThree);
        JButton b4 = new JButton("BOTTOM");
        b4.addActionListener(listenFour);
        JButton b5 = new JButton("1");
        JButton b6 = new JButton("2");
        JButton b7 = new JButton("3");
        JButton b8 = new JButton("4");
        buttonsPanel.add(b5);
        buttonsPanel.add(b6);
        buttonsPanel.add(b7);
        buttonsPanel.add(b8);

        frame.add(b1, BorderLayout.PAGE_START);
        frame.add(b2, BorderLayout.LINE_START);
        frame.add(b3, BorderLayout.LINE_END);
        frame.add(b4, BorderLayout.PAGE_END);
        frame.add(buttonsPanel, BorderLayout.CENTER);

        frame.pack();

        return new Learn();
    }

}
