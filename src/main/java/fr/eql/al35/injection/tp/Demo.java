package fr.eql.al35.injection.tp;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.eql.al35.injection.gui.Afficher;

//Rende la classe un componente di spring
@Component
public class Demo {
		
		//Autowired lega la classe Demo con l'interfaccia Afficher
		@Autowired
		private Afficher afficher = null;
		
		//Con questa annotazione il metodo sarà richiamato automaticamente alla creazione dell'oggetto
		@PostConstruct
		public void initialisation() {
			afficher.afficher("Hello World");
		}
}
