package fr.eql.al35.injection.tp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import fr.eql.al35.injection.gui.Afficher;
import fr.eql.al35.injection.trad.Traducteur;

//Rende la classe un componente di spring
@Component
public class Demo {
		
		//Autowired lega la classe Demo con l'interfaccia Afficher
		//NB le classi da legare devono avere l'annotazione @Component
		@Autowired
		@Qualifier("text")
		private Afficher afficher = null;
		
		@Autowired
		private Traducteur traducteur = null;
		
		//Con questa annotazione il metodo sarà richiamato automaticamente alla creazione dell'oggetto
		@PostConstruct
		public void initialisation() {
			String textToTrad = traducteur.traduire("message a traduire");
			afficher.afficher("Hello World");
			afficher.afficher(textToTrad);
			
		}
}
