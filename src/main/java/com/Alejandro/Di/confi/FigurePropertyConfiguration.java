/**
 * 
 */
package com.Alejandro.Di.confi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Alejandro
 *
 */
@Configuration
@PropertySource("classpath:Areas.properties")
public class FigurePropertyConfiguration {
	
	@Bean
	public PropertySourcesPlaceholderConfigurer getConfigu() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	

}
