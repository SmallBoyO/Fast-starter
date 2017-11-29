package com.zhanghe.fast.starter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhanghe.fast.starter.aop.ValidateTreatement;
import com.zhanghe.fast.starter.service.UserService;

@Configuration
public class AutoConfiguration {
	
    @Bean
    public UserService dbCountRunner() {
        return new UserService();
    }
    
    @Bean
    public ValidateTreatement validateTreatement() {
        return new ValidateTreatement();
    }
}
