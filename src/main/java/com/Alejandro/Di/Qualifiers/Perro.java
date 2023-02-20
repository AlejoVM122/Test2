/**
 * 
 */
package com.Alejandro.Di.Qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Alejandro
 *
 */


@Component
public class Perro extends Animal {

	public Perro(@Value ("2") Integer  edad, @Value ("Tommy") String nombre) {
		super(edad, nombre);
		// TODO Auto-generated constructor stub
	}
	
	
}
