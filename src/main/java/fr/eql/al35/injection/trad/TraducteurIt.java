package fr.eql.al35.injection.trad;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"enItalien"})  //associa la classe al profilo enItalien che richiamiamo nel main
public class TraducteurIt implements Traducteur {

	@Override
	public String traduire(String message) {
		// TODO Auto-generated method stub
		return "traduction itelien de : " + message;
	}

}
