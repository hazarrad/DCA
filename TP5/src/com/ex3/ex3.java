package com.ex3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ex3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex3 frame = new ex3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ex3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(181, 96, 245, 28);
		contentPane.add(lblNewLabel);

		ActionListener actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("The " + e.getActionCommand() + " is clicked");
			}
		};

		JButton btn_1 = new JButton("Button 1");
		btn_1.addActionListener(actionListener);
		btn_1.setBounds(46, 69, 85, 21);
		contentPane.add(btn_1);

		JButton btn_2 = new JButton("Button 2");
		btn_2.addActionListener(actionListener);
		btn_2.setBounds(46, 100, 85, 21);
		contentPane.add(btn_2);

		JButton btn_3 = new JButton("Button 3");
		btn_3.addActionListener(actionListener);
		btn_3.setBounds(46, 131, 85, 21);
		contentPane.add(btn_3);

	}
}
