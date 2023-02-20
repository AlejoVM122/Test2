package com.Alejandro.Di;

import java.beans.Expression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.Alejandro.Di.AOP.TargetObject;
import com.Alejandro.Di.Qualifiers.Animal;
import com.Alejandro.Di.Qualifiers.Avion;
import com.Alejandro.Di.Qualifiers.Nido;
import com.Alejandro.Di.Qualifiers.Pajaro;
import com.Alejandro.Di.Qualifiers.Perro;
import com.Alejandro.Di.Scopes.EjemploScope;
import com.Alejandro.Di.atributo.Carro;
import com.Alejandro.Di.autowire.AreaCalculatorServices;
import com.Alejandro.Di.lifeCycle.ExplicitBean;
import com.Alejandro.Di.lifeCycle.lifeCycleBean;
import com.Alejandro.Di.profiels.EnvironmentService;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);

	
	public static void main(String[] args) {

		ConfigurableApplicationContext context =SpringApplication.run(DependencyInjectionApplication.class, args);
		
			TargetObject targetObject = context.getBean(TargetObject.class);
	
			targetObject.hellow("Hola soy alejandro");
		
	
	
	}
}
