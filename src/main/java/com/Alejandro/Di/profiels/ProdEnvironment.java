/**
 * 
 */
package com.Alejandro.Di.profiels;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Alejandro
 *
 */

@Service
@Profile({"Prod","default"})
public class ProdEnvironment implements EnvironmentService {

	@Override
	public String getEnvironment() {
		// TODO Auto-generated method stub
		return "Prod";
	}

}
