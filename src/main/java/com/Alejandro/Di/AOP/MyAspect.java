package com.Alejandro.Di.AOP;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

private static final Logger log = LoggerFactory.getLogger(MyAspect.class);


@Before("execution(* com.Alejandro.Di.AOP.TargetObject.*(..))")
public void before (JoinPoint joinPoint) {
	log.info("nombre del Metodo "+ joinPoint.getSignature().getName());
	log.info("typo de objeto"+ joinPoint.getSignature().getDeclaringType());
	log.info("modificadores" + joinPoint.getSignature().getModifiers());
	log.info("Argumentos"+ joinPoint.getArgs());

	log.info("Acá usamos la anotacion Before en una clase que anotamos como aspecto");
}
	
	
}
