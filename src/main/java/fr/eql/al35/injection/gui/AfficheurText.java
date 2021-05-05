package fr.eql.al35.injection.gui;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Rende la classe un componente di spring
@Component
@Qualifier("text")
public class AfficheurText implements Afficher {

	@Override
	public void afficher(String message) {
		System.out.println(message);
	}

}
