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
public class Cuadrado implements Figura {

	@Value("${Cuadrado.size}")
	private double size;
	@Override
	public double calcularArea() {
		
		return size*size;
	}
	

}
