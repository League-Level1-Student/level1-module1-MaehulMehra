package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornRunner {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog(null, "What flavor popcorn do you want?");
		Popcorn corn = new Popcorn (flavor);
		Microwave microwave = new Microwave ();
		microwave.putInMicrowave(corn);
		String minutes = JOptionPane.showInputDialog(null, "How many minutes do you want the microwave to run?");
		int minInt = Integer.parseInt(minutes);
		microwave.setTime(minInt);
		microwave.startMicrowave();
	
	}
}
