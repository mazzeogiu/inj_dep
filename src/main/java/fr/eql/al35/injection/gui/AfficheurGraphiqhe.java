package fr.eql.al35.injection.gui;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("graph")
public class AfficheurGraphiqhe implements Afficher {

	@Override
	public void afficher(String message) {
		//le pachet javax.swing é optionale nelle versioni superiori a java 8
		//JOptionPane.showMessageDialog(null, message);
		
		System.out.println("afficheur graphique" + message);

	}

}
