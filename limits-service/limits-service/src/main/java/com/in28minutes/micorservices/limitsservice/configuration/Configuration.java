package com.in28minutes.micorservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/*
 * @ConfigurationProperties - annotation is used to configure the limit service values from 
	application.properties file
*/
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
	
	private int minimum;	
	private int maximum;
	
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
