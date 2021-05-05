package fr.eql.al35.injection.gui;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

//@Component
public class AfficheurGraphiqhe implements Afficher {

	@Override
	public void afficher(String message) {
		JOptionPane.showMessageDialog(null, message);

	}

}
