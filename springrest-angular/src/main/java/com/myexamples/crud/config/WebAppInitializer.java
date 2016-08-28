package com.myexamples.crud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.myexamples.crud")
public class WebAppInitializer {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(WebAppInitializer.class, args);
	}
}
