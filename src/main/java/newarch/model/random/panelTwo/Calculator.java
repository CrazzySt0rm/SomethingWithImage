package newarch.model.random.panelTwo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Calculator {

    public static void main(String[] args) {


        //public static void main (String[]args){
        JFrame frame = new JFrame();
        frame.setTitle("Hello");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(2, 2));

        EasyCalculator listen = new EasyCalculator();
        EasyCalculator listenTwo = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("+");
            }
        };
        EasyCalculator listenThree = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("-");
            }
        };
        EasyCalculator listenFour = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("=");
            }
        };
        EasyCalculator listenFive = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
            }
        };
        EasyCalculator listenSix = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("2");
            }
        };
        EasyCalculator listenSeven = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("3");
            }
        };
        EasyCalculator listenEight = new EasyCalculator() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("4");
            }
        };
        JButton b1 = new JButton("/");
        b1.addActionListener(listen);
        JButton b2 = new JButton("+");
        b2.addActionListener(listenTwo);
        JButton b3 = new JButton("-");
        b3.addActionListener(listenThree);
        JButton b4 = new JButton("=");
        b4.addActionListener(listenFour);

        JButton b5 = new JButton("1");
        b5.addActionListener(listenFive);
        JButton b6 = new JButton("2");
        b6.addActionListener(listenSix);
        JButton b7 = new JButton("3");
        b7.addActionListener(listenSeven);
        JButton b8 = new JButton("4");
        b8.addActionListener(listenEight);
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

//        return new Learn();
    }


}

