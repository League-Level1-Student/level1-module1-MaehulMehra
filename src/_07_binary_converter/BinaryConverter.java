package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame = new JFrame ("Convert 8 bits of binary to ASCII");
	JPanel panel = new JPanel ();
	JButton button = new JButton ("convert");
	JTextField field = new JTextField (20);
	JLabel label = new JLabel ();
	public void binary () {
		panel.add(field);
		panel.add(button);
		panel.add(label);
		frame.setVisible(true);
		frame.add(panel);
		frame.pack();
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String binary = field.getText();
		String letter = convert (binary);
		label.setText (letter);
		// TODO Auto-generated method stub
		
	}
	String convert(String input) {
	    if(input.length() != 8){
	        JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
	        return "-";
	    }
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}
}
