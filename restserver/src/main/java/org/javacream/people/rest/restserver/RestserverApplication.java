package org.javacream.people.rest.restserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestserverApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(RestserverApplication.class, args);
	}
}
