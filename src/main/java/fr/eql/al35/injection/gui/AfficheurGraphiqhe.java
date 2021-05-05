package fr.eql.al35.injection.gui;

import javax.swing.JOptionPane;

import org.springframework.stereotype.Component;

@Component
public class AfficheurGraphiqhe implements Afficher {

	@Override
	public void afficher(String message) {
		//le pachet javax.swing é optionale nelle versioni superiori a java 8
		JOptionPane.showMessageDialog(null, message);

	}

}
