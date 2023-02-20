/**
 * 
 */
package com.Alejandro.Di.lifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.stereotype.Component;

/**
 * @author Alejandro
 *
 */

@Component
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor{

	
	private static final Logger log = LoggerFactory.getLogger(BeanPostProcessor.class);

	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof lifeCycleBean) {
			log.info("Before initialization ."+beanName);	
		}
		return bean;
	}

	 @Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if (bean instanceof lifeCycleBean) {
			log.info("After > initialization ."+beanName);
		}
		return bean;
	}

	
}
