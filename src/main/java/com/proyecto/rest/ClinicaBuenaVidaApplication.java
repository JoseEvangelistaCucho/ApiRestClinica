package com.proyecto.rest;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;





//"com.proyecto.rest.service", "com.proyecto.rest.dao",
@SpringBootApplication
@EnableJpaAuditing
//@ComponentScan(basePackages={"com.proyecto.rest.controller"})
public class ClinicaBuenaVidaApplication{// extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ClinicaBuenaVidaApplication.class, args);
	}
	
	
/*	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ClinicaBuenaVidaApplication.class);
	}*/
	


}
