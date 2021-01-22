package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Vault vault = new Vault ();
		if (vault.tryCode(55)) {
			JOptionPane.showMessageDialog(null, "You opened the vault.");
		}
		else {
			JOptionPane.showMessageDialog(null, "You did not open the vault.");
		}
	}
}
