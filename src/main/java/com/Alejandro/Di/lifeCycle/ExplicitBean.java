/**
 * 
 */
package com.Alejandro.Di.lifeCycle;

/**
 * @author Alejandro
 *
 */
public class ExplicitBean  {
	public void init () {
		System.out.println("Init Method");
	}

	
	public void destroy () {
		System.out.println("Destroy Method");
	}
}
