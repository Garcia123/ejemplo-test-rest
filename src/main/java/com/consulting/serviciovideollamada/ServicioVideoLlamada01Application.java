package com.consulting.serviciovideollamada;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ServicioVideoLlamada01Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ServicioVideoLlamada01Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(ServicioVideoLlamada01Application.class);
	}
	
	
}
