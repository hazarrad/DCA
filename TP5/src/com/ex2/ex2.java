package com.ex2;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ex2 extends JFrame {

	private JPanel contentPane;
	private static JTextField input;
	private static JTextField output;
	private static String pattern = "[0-9]+";
	private static JLabel errorMsg = new JLabel("Invalid input");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ex2 frame = new ex2();
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
	public ex2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 633, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		input = new JTextField();
		input.setBounds(104, 84, 170, 35);
		contentPane.add(input);
		input.setColumns(10);

		JLabel lblNewLabel = new JLabel("Enter a Number");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(103, 61, 124, 19);
		contentPane.add(lblNewLabel);

		JLabel lblResult = new JLabel("Result Dirhams");
		lblResult.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResult.setBounds(104, 162, 124, 19);
		contentPane.add(lblResult);

		output = new JTextField();
		output.setEditable(false);
		output.setBounds(104, 191, 170, 35);
		contentPane.add(output);
		output.setColumns(10);

		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				validateInput();


			}
		});
		btnNewButton.setBounds(428, 84, 134, 35);
		contentPane.add(btnNewButton);

		errorMsg.setBounds(114, 118, 170, 19);
		errorMsg.setVisible(false);
		contentPane.add(errorMsg);
	}

	private static void validateInput() {
		String text = input.getText();
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(text);
		if (m.matches()) {
			errorMsg.setVisible(false);
			double rs = Double.valueOf(input.getText()) * 10;
			output.setText(String.valueOf(rs));
		} else {
			errorMsg.setVisible(true);
			errorMsg.setForeground(Color.RED);
		}
	}
}
