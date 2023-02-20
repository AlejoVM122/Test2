package com.Alejandro.Di.profiels;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Dev")
public class DevEnvironment implements EnvironmentService{

	@Override
	public String getEnvironment() {
		// TODO Auto-generated method stub
		return "Dev";
	}

}
