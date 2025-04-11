package br.edu.atitus.greating_service;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("greating-service")
public class GreatingConfig {
	
	private String greating;
	private String defaulName;
	
	public String getGreating() {
		return greating;
	}
	public void setGreating(String greating) {
		this.greating = greating;
	}
	public String getDefaulName() {
		return defaulName;
	}
	public void setDefaulName(String defaulName) {
		this.defaulName = defaulName;
	}
	
 
}
