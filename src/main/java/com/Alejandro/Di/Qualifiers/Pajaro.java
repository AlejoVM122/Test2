package com.Alejandro.Di.Qualifiers;


import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;


@Component
@Primary
public class Pajaro extends Animal implements Volador {

	
	private static final Logger log = (Logger) LoggerFactory.getLogger(Pajaro.class);
	
	public Pajaro(@Value("25")Integer edad,@Value("PAJARO LOCO") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}

	
	 
	@Override
	public void volar() {
		log.info("soy un pajaro y "+ " estoy volando");
		
	}




}
