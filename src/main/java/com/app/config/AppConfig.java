package com.app.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AppConfig {
	//1.7 jdk
	@Bean
	public CommandLineRunner c1() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				// TODO Auto-generated method stub
				System.out.println("from 7 runner");
				
			}
		};
	
	}
	
	//1.8 jdk lambda expression
	
	@Bean
	public CommandLineRunner c2() {
		return args->System.out.println("from 8 runner");
	}
}
