package com.nk2164.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class IntroToGUI {

	public static void main(String[] args) {

		JFrame f = new JFrame("My First GUI Application");
		f.setSize(400, 100);
		f.setLocation(500, 200);
		JTextField ourTextField = new JTextField();
		JButton ourButton = new JButton();
		ourButton.setText("Show TF1");
		ourButton.setForeground(Color.BLUE);

		JTextField ourTextField1 = new JTextField();
		JButton ourButton1 = new JButton();
		ourButton1.setText("Show TF2");
		ourButton1.setForeground(Color.RED);

		f.setLayout(new GridLayout(2, 4));
		f.add(ourTextField);
		f.add(ourButton);
		f.add(ourTextField1);
		f.add(ourButton1);

		ourButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ourTextField.getText());
			}

		});

		ourButton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(ourTextField1.getText());
			}

		});

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
