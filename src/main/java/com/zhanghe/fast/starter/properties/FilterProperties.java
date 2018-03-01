package com.zhanghe.fast.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("fast.filter")
public class FilterProperties {

	String xssPatterns;

	public String getXssPatterns() {
		return xssPatterns;
	}

	public void setXssPatterns( String xssPatterns ) {
		this.xssPatterns = xssPatterns;
	}
	
	
	
}
