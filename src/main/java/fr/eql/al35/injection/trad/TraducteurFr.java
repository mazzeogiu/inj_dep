package fr.eql.al35.injection.trad;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"enFrancais"}) //associa la classe al profilo enFrancais che richiamiamo nel main
public class TraducteurFr implements Traducteur {

	@Override
	public String traduire(String message) {
		// TODO implement traslation
		return "traduction francais de : " + message;
	}

}
