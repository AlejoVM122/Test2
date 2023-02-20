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
public class Carro {
	
	
	private String  modelo;

	private String marca;
	
	private Motor motor;
	

	public Carro() {
	
	}




	public String getModelo() {
		return modelo;
	}

	public void setModelo(@Value("M500") String modelo) {
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}

	
	public void setMarca(@Value("FIDET") String marca) {
		this.marca = marca;
	}


	public Motor getMotor() {
		return motor;
	}

	@Autowired
	public void setMotor( Motor motor) {
		this.motor = motor;
	}


	@Override
	public String toString() {
		return "Carro [modelo=" + modelo + ", marca=" + marca + ", motor=" + motor + "]";
	}


	
	

}
