package com.zhanghe.fast.starter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zhanghe.fast.starter.aop.ValidateTreatement;
/**  
 * AutoConfiguration
 *   
 * @author Clevo  
 * @date 2017/12/11 21:27
 */  
@Configuration
public class AutoConfiguration {


    @Bean
    public ValidateTreatement validateTreatement() {
        return new ValidateTreatement();
    }
}
