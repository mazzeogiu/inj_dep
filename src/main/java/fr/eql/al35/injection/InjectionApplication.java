package fr.eql.al35.injection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InjectionApplication {

	public static void main(String[] args) {
		
		//Set profile on startup
		SpringApplication app = new SpringApplication(InjectionApplication.class);
		app.setAdditionalProfiles("enItalien","profile2");
		
		//run application
		ConfigurableApplicationContext context = app.run(args);
		
		
		
		//Fix Error JOptionPane
		//SpringApplicationBuilder builder = new SpringApplicationBuilder(InjectionApplication.class);
		//builder.headless(false);
		//ConfigurableApplicationContext context = builder.run(args);
	}

}
