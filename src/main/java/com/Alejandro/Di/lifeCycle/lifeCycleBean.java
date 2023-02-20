/**
 * 
 */
package com.Alejandro.Di.lifeCycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * @author Alejandro
 *
 */
@Component
@Lazy
public class lifeCycleBean implements BeanNameAware,InitializingBean,DisposableBean {
	
	
	
	private static final Logger log = LoggerFactory.getLogger(lifeCycleBean.class);

	@Override
	public void setBeanName(String name) {
	
		log.info("bean name aware " + name);
	
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		log.info("after properties set metohd");
	}


	@PostConstruct
	public void init () {
		log.info("Post Construct {}");
		
	}
	
	
	@PreDestroy
	public void destroyBean () {
		log.info("Pre Destroy {}");
	}


	@Override
	public void destroy() throws Exception {
	log.info("method destroy implement");
		
	}
	
	

}
