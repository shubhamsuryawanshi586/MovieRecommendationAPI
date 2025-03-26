package org.moviefusion;

import org.moviefusion.swagger.SwaggerConfigs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MovieFusionApiApplication {
	private static boolean swaggerOpened = true;
	public static void main(String[] args) {
		
		if(swaggerOpened)
		{
			SpringApplication.run(MovieFusionApiApplication.class, args);
			SwaggerConfigs.openSwaggerUI();
			swaggerOpened = false;
		}
	}
 
	
}
  