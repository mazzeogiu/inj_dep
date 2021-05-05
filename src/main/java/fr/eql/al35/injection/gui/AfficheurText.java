package fr.eql.al35.injection.gui;

import org.springframework.stereotype.Component;

//Rende la classe un componente di spring
//@Component
public class AfficheurText implements Afficher {

	@Override
	public void afficher(String message) {
		System.out.println(message);
	}

}
