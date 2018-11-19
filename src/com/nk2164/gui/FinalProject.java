package com.nk2164.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FinalProject {
	static int currentUser = 0;
	static User[] UserArray = new User[100];

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.setSize(200, 300);

		JTextField NameTextField = new JTextField();
		JTextField userNameTextField = new JTextField();
		JTextField PasswordTextField = new JTextField();
		JLabel NameLable = new JLabel("Name :");
		JLabel userNameLable = new JLabel("Username :");
		JLabel passwordNameLable = new JLabel("Password :");

		JButton signupButton = new JButton();
		signupButton.setText("Sign up");

		JButton logInButton = new JButton();
		logInButton.setText("Log in");

		f.setLayout(new GridLayout(4, 2));

		f.add(NameLable);
		f.add(NameTextField);

		f.add(userNameLable);
		f.add(userNameTextField);

		f.add(passwordNameLable);
		f.add(PasswordTextField);

		f.add(logInButton);
		f.add(signupButton);

		logInButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				NameTextField.setVisible(false);
				userNameLable.setVisible(false);
				userNameTextField.setVisible(false);
				passwordNameLable.setVisible(false);
				PasswordTextField.setVisible(false);
				logInButton.setVisible(false);
				signupButton.setVisible(false);
				
				boolean userFound = false;
				
				for (User user : UserArray) {
					if (user != null && user.getName().equals(NameTextField.getText())) {
						NameLable.setText("Hi " + NameTextField.getText());
						userFound = true;
					}
				}
				
				if(!userFound) {
					NameLable.setText("Sorry we dont recognize you!");
				}

			}
		});

		signupButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				User userToAdd = new User(NameTextField.getText(), userNameTextField.getText(),
						PasswordTextField.getText());

				boolean userExists = false;

				for (User user : UserArray) {
					if (user != null && user.getName().equals(userToAdd.getName())) {
						userExists = true;
					}
				}

				if (!userExists && userToAdd.getName() != "") {
					UserArray[currentUser] = userToAdd;
					System.out.println("Added user with name " + userToAdd.getName());
				}

			}
		});

		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
