package com.bradl3y.getapiendpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetApiEndpointApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetApiEndpointApplication.class, args);
	}

	//This functionality is now handled by CORSFilter.java
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		return new WebMvcConfigurer() {
//			@Override
//			public void addCorsMappings(CorsRegistry registry) {
//				registry.addMapping("/**")
//						.allowedOrigins("*")
//						.allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD");
//			}
//		};
//	}
}
