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
	
	String title;
	String basepackage;
	String version;
	String contractName;
	String contractUrl;
	String contractEmail;
	
	public String getBasepackage() {
		return basepackage;
	}

	public void setBasepackage( String basepackage ) {
		this.basepackage = basepackage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle( String title ) {
		this.title = title;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion( String version ) {
		this.version = version;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName( String contractName ) {
		this.contractName = contractName;
	}

	public String getContractUrl() {
		return contractUrl;
	}

	public void setContractUrl( String contractUrl ) {
		this.contractUrl = contractUrl;
	}

	public String getContractEmail() {
		return contractEmail;
	}

	public void setContractEmail( String contractEmail ) {
		this.contractEmail = contractEmail;
	}
	
}
