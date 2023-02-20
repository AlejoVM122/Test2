/**
 * 
 */
package com.Alejandro.Di.AOP;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author Alejandro
 *
 */
@Component
public class TargetObject {
	
	private static final Logger log = LoggerFactory.getLogger(TargetObject.class);


	public void hellow (String message) {
		log.info(message);
	}

}
