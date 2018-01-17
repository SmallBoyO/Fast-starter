package com.zhanghe.fast.starter.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.zhanghe.fast.starter.properties.SwaggerProperties;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**  
 * SwaggerConfiguration
 *   
 * @author Clevo  
 * @date 2017/12/11 21:31 
 */  
@Configuration
@EnableSwagger2
@EnableConfigurationProperties(SwaggerProperties.class)
public class SwaggerConfiguration {
	
	@Autowired
	private SwaggerProperties swaggerProperties;
	
	@Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerProperties.getBasepackage()))
                .paths(PathSelectors.any())
                .build();
    }

    @SuppressWarnings("deprecation")
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Fast RESTful APIs")
                .description("")
                .termsOfServiceUrl("")
                .contact(new Contact("SmallBoys","","554645932@qq.com"))
                .version("1.0")
                .build();
    }
}
