//Author Peter Adamson

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI2 extends JFrame{

	private final int WIDTH = 300;
	private final int HEIGHT = 100;
	private JTextField incrementField;
	private JButton incrementButton;
	private JButton decrementButton;
	private JButton resetButton;
	private int count = 0;
	private int increment = 1;

	public CounterGUI2(){
		setSize(WIDTH, HEIGHT);
		setTitle("CounterGUI2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createComponents();
	}

	private void createComponents(){
		incrementField = new JTextField("0", 3);
		incrementButton = new JButton("Increment");
		ActionListener inc = new IncListener();
		incrementButton.addActionListener(inc);
		decrementButton = new JButton("Decrement");
		ActionListener dec = new DecListener();
		decrementButton.addActionListener(dec);
		resetButton = new JButton("Reset");
		ActionListener res = new ResetListener();
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

	private class IncListener implements ActionListener{


		public void actionPerformed(ActionEvent e){
			
			count = Integer.parseInt(incrementField.getText()) + increment;
			incrementField.setText(String.valueOf(count));
		}
			

	}

	private class DecListener implements ActionListener{


		public void actionPerformed(ActionEvent e){
			
			count = Integer.parseInt(incrementField.getText()) - increment;
			incrementField.setText(String.valueOf(count));
		}
			

	}

	private class ResetListener implements ActionListener{


		public void actionPerformed(ActionEvent e){
			incrementField.setText("0");
		}
			

	}	

	public static void main(String[] args){
		CounterGUI2 app = new CounterGUI2();
		app.setVisible(true);
	}
}
