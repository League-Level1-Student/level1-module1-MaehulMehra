package _02_cat;

import javax.swing.JOptionPane;

public class CatRunner {
	public static void main(String[] args) {
		runUntilKill();
	}

	private static void runUntilKill() {
		Cat cat = new Cat ("Akakad");
		cat.meow();
		cat.printName();
		String lives = JOptionPane.showInputDialog(null, "How many times do you want to kill the cat?");
		int livesInt = Integer.parseInt(lives);
		for (int i = 0; i < livesInt; i++) {
			cat.kill();
		}
	}
}
