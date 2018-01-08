//Author Peter Adamson

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IncrementListener extends ButtonListener{

	public IncrementListener(JTextField field){
		super(field);
	} 

	public void actionPerformed(ActionEvent e){
			
		int count = Integer.parseInt(getTextField().getText()) + getIncrement();
		getTextField().setText(String.valueOf(count));
	}
			

}

