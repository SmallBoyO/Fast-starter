package com.zhanghe.fast.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fast.swagger")
public class SwaggerProperties {
	
	String basepackage;

	public String getBasepackage() {
		return basepackage;
	}

	public void setBasepackage( String basepackage ) {
		this.basepackage = basepackage;
	}
	
}
