package com.zhanghe.fast.starter.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhanghe.fast.starter.filter.XssFilter;
import com.zhanghe.fast.starter.properties.FilterProperties;

@Configuration
@EnableConfigurationProperties(FilterProperties.class)
public class FilterConfiguration {

	@Autowired
	FilterProperties filterProperties;
	
	@Bean
	public FilterRegistrationBean filterRegistrationBean(){
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new XssFilter());
		if(filterProperties.getXssPatterns() != null && !"".equals(filterProperties.getXssPatterns())){
			filterRegistrationBean.addUrlPatterns(filterProperties.getXssPatterns());
		}else{
			filterRegistrationBean.addUrlPatterns("/*");
		}
		return filterRegistrationBean;
	}
	
}
