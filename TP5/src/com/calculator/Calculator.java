package com.calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel res = new JLabel("0");
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnAdd, btnEqual, btnClear, btn_dot, btnSub,
			btnMul, btnDiv;
	String operation;
	double num1 = 0, num2 = 0, result = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 369, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn1.setBackground(Color.WHITE);
		btn1.setBounds(68, 244, 49, 36);
		contentPane.add(btn1);

		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setForeground(Color.BLACK);
		btn2.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn2.setBackground(Color.WHITE);
		btn2.setBounds(127, 244, 49, 36);
		contentPane.add(btn2);

		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn3.setForeground(Color.BLACK);
		btn3.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn3.setBackground(Color.WHITE);
		btn3.setBounds(186, 244, 49, 36);
		contentPane.add(btn3);

		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setForeground(Color.BLACK);
		btn4.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn4.setBackground(Color.WHITE);
		btn4.setBounds(68, 198, 49, 36);
		contentPane.add(btn4);

		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn5.setForeground(Color.BLACK);
		btn5.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn5.setBackground(Color.WHITE);
		btn5.setBounds(127, 198, 49, 36);
		contentPane.add(btn5);

		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn6.setForeground(Color.BLACK);
		btn6.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn6.setBackground(Color.WHITE);
		btn6.setBounds(186, 198, 49, 36);
		contentPane.add(btn6);

		btn7 = new JButton("7");
		btn7.addActionListener(this);
		btn7.setForeground(Color.BLACK);
		btn7.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn7.setBackground(Color.WHITE);
		btn7.setBounds(68, 152, 49, 36);
		contentPane.add(btn7);

		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn8.setBackground(Color.WHITE);
		btn8.setBounds(127, 152, 49, 36);
		contentPane.add(btn8);

		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btn9.setForeground(Color.BLACK);
		btn9.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn9.setBackground(Color.WHITE);
		btn9.setBounds(186, 152, 49, 36);
		contentPane.add(btn9);

		btn_dot = new JButton(".");
		btn_dot.addActionListener(this);
		btn_dot.setForeground(Color.BLACK);
		btn_dot.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn_dot.setBackground(Color.WHITE);
		btn_dot.setBounds(68, 294, 49, 36);
		contentPane.add(btn_dot);

		btn0 = new JButton("0");
		btn0.addActionListener(this);
		btn0.setForeground(Color.BLACK);
		btn0.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btn0.setBackground(Color.WHITE);
		btn0.setBounds(127, 294, 49, 36);
		contentPane.add(btn0);

		btnEqual = new JButton("=");
		btnEqual.addActionListener(this);
		btnEqual.setForeground(Color.BLACK);
		btnEqual.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btnEqual.setBackground(Color.WHITE);
		btnEqual.setBounds(186, 294, 108, 36);
		contentPane.add(btnEqual);

		btnAdd = new JButton("+");
		btnAdd.addActionListener(this);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btnAdd.setBackground(Color.WHITE);
		btnAdd.setBounds(245, 244, 49, 36);
		contentPane.add(btnAdd);

		btnSub = new JButton("-");
		btnSub.addActionListener(this);
		btnSub.setForeground(Color.BLACK);
		btnSub.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btnSub.setBackground(Color.WHITE);
		btnSub.setBounds(245, 198, 49, 36);
		contentPane.add(btnSub);

		btnMul = new JButton("x");
		btnMul.addActionListener(this);
		btnMul.setForeground(Color.BLACK);
		btnMul.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btnMul.setBackground(Color.WHITE);
		btnMul.setBounds(245, 152, 49, 36);
		contentPane.add(btnMul);

		btnDiv = new JButton("/");
		btnDiv.addActionListener(this);
		btnDiv.setForeground(Color.BLACK);
		btnDiv.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btnDiv.setBackground(Color.WHITE);
		btnDiv.setBounds(245, 106, 49, 36);
		contentPane.add(btnDiv);

		btnClear = new JButton("C");
		btnClear.addActionListener(this);
		btnClear.setForeground(Color.BLACK);
		btnClear.setFont(new Font("Sitka Small", Font.PLAIN, 16));
		btnClear.setBackground(Color.WHITE);
		btnClear.setBounds(68, 106, 167, 36);
		contentPane.add(btnClear);

		res.setFont(new Font("Tahoma", Font.PLAIN, 30));
		res.setHorizontalAlignment(SwingConstants.RIGHT);
		res.setBackground(Color.WHITE);
		res.setBounds(68, 25, 226, 71);
		contentPane.add(res);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnClear) {
			res.setText("");
		} else {
			if (e.getSource() == btnAdd) {
				num1 = Double.parseDouble(res.getText());
				res.setText("");
				operation = "+";
			} else if (e.getSource() == btnSub) {
				num1 = Double.parseDouble(res.getText());
				res.setText("");
				operation = "-";

			} else if (e.getSource() == btnDiv) {
				num1 = Double.parseDouble(res.getText());
				res.setText("");
				operation = "/";

			} else if (e.getSource() == btnMul) {
				num1 = Double.parseDouble(res.getText());
				res.setText("");
				operation = "*";
			} else if (e.getSource() == btnEqual) {
				String answer;
				num2 = Double.parseDouble(res.getText());

				switch (operation) {
				case "+":
					result = num1 + num2;
					answer = String.format("%.2f", result);
					res.setText(answer);
					break;
				case "-":
					result = num1 - num2;
					answer = String.format("%.2f", result);
					res.setText(answer);
					break;
				case "/":
					result = num1 / num2;
					answer = String.format("%.2f", result);
					res.setText(answer);
					break;
				case "*":
					result = num1 * num2;
					answer = String.format("%.2f", result);
					res.setText(answer);
					break;
				default:
					break;
				}
			} else {
				String number = res.getText() + String.format("%s", e.getActionCommand());
				res.setText(number);
			}

		}

	}
}
