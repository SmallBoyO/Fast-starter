package com.zhanghe.fast.starter.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
/**  
 * SwaggerProperties
 *   
 * @author Clevo  
 * @date 2017/12/11 21:31 
 */  
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
