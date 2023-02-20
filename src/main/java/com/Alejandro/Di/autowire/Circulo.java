/**
 * 
 */
package com.Alejandro.Di.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Alejandro
 *
 */
@Component
public class Circulo implements Figura{

	
	@Value("${Circule.radio}")
	private double radio;
	@Override
	public double calcularArea() {
		
		return Math.PI * Math.pow(radio, 2);
	}
	
	

}
