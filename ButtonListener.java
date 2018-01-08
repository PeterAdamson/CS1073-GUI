//Author Peter Adamson

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class ButtonListener implements ActionListener{

	private JTextField myTextField;
	private int increment = 1;

	public ButtonListener(JTextField field){
		myTextField = field;
	}

	public int getIncrement(){
		return increment;
	}

	public JTextField getTextField(){
		return myTextField;
	}
}
