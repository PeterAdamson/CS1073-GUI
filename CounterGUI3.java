//Author Peter Adamson

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI3 extends JFrame{

	private final int WIDTH = 300;
	private final int HEIGHT = 100;
	private JTextField incrementField;
	private JButton incrementButton;
	private JButton decrementButton;
	private JButton resetButton;
	private int count = 0;
	private int increment = 1;

	public CounterGUI3(){
		setSize(WIDTH, HEIGHT);
		setTitle("CounterGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createComponents();
	}

	private void createComponents(){
		incrementField = new JTextField("0", 3);
		incrementButton = new JButton("Increment");
		ActionListener inc = new IncrementListener(incrementField);
		incrementButton.addActionListener(inc);
		decrementButton = new JButton("Decrement");
		ActionListener dec = new DecrementListener(incrementField);
		decrementButton.addActionListener(dec);
		resetButton = new JButton("Reset");
		ActionListener res = new ResetListener(incrementField);
		resetButton.addActionListener(res);
		
		incrementField.setHorizontalAlignment(JTextField.RIGHT);

		JPanel fieldPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		fieldPanel.add(incrementField);
		buttonPanel.add(incrementButton);
		buttonPanel.add(decrementButton);
		buttonPanel.add(resetButton);
		add(buttonPanel, BorderLayout.CENTER);
		add(fieldPanel, BorderLayout.LINE_START);
		
			
	}

	public static void main(String[] args){
		CounterGUI3 app = new CounterGUI3();
		app.setVisible(true);
	}
}
