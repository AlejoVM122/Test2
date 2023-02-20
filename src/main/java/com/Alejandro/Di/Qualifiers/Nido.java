package com.Alejandro.Di.Qualifiers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import jakarta.annotation.Priority;



@Component
public class Nido {

	
	
	private static final Logger log = LoggerFactory.getLogger(Nido.class);

	@Autowired
	private Animal pajaro;
	
	
	public void imprimir() {
		log.info("El pajaro se posa sobre el nido ", pajaro.getNombre());
	}
	
}
