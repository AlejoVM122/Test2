/**
 * 
 */
package com.Alejandro.Di.atributo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Alejandro
 *
 */
@Component
public class Motor {
	
	
	private String modelo; 
	
	
	private Integer año;


	public Motor() {
		
	}


	public String getModelo() {
		return modelo;
	}

	
	public void setModelo(@Value("MY33") String modelo) {
		this.modelo = modelo;
	}

	public Integer getAño() {
		return año;
	}
	
	public void setAño(@Value("1555")Integer año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Motor [modelo=" + modelo + ", año=" + año + "]";
	}
	

	
	
}
