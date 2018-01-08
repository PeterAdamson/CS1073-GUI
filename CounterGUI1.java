//Author Peter Adamson

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CounterGUI1 extends JFrame{

	private final int WIDTH = 300;
	private final int HEIGHT = 100;
	private JTextField incrementField;
	private JButton incrementButton;
	private JButton decrementButton;
	private JButton resetButton;
	private int count = 0;
	private int increment = 1;

	public CounterGUI1(){
		setSize(WIDTH, HEIGHT);
		setTitle("CounterGUI1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createComponents();
	}

	private void createComponents(){
		incrementField = new JTextField("0", 3);
		incrementButton = new JButton("Increment");
		ActionListener listener = new ButtonListener();
		incrementButton.addActionListener(listener);
		decrementButton = new JButton("Decrement");
		decrementButton.addActionListener(listener);
		resetButton = new JButton("Reset");
		resetButton.addActionListener(listener);
		
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

	private class ButtonListener implements ActionListener{


		public void actionPerformed(ActionEvent e){
			if(e.getSource()==incrementButton){
				count = Integer.parseInt(incrementField.getText()) + increment;
				incrementField.setText(String.valueOf(count));
			}

			if(e.getSource()==decrementButton){
				count = Integer.parseInt(incrementField.getText()) - increment;
				incrementField.setText(String.valueOf(count));
			}

			if(e.getSource()==resetButton){
				incrementField.setText("0");
			}

	}
}	

	public static void main(String[] args){
		CounterGUI1 app = new CounterGUI1();
		app.setVisible(true);
	}
}
