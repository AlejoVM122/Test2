/**
 * 
 */
package com.Alejandro.Di.autowire;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Alejandro
 *
 */
@Service
public class AreaCalculatorServices {

	
	private static final Logger log = LoggerFactory.getLogger(AreaCalculatorServices.class);

	
	@Autowired
	private List<Figura> figuras;
	
	public double calArea (){
		double area= 0;
		for (Figura figura : figuras) {
			area += figura.calcularArea();
		}
		return area;
	}
}
