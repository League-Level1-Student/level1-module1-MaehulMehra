package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault ();
		Spy spy = new Spy ();
		int i = spy.findCode(vault);
		System.out.println(i);
	}
}
