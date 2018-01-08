//Author Peter Adamson

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ResetListener extends ButtonListener{

	public ResetListener(JTextField field){
		super(field);
	}

	public void actionPerformed(ActionEvent e){
		getTextField().setText("0");
	}
			

}	
