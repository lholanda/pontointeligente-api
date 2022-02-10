package com.lh.pontointeligente.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PontoInteligenteApplication implements CommandLineRunner{
	
	@Value("${propertiesInfo}")
	private String  propertiesInfo;

	public static void main(String[] args) {
		SpringApplication.run(PontoInteligenteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("PontoInteligenteApplication "+ propertiesInfo );	
		
	}
	
	/*
	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			System.out.println("aplicação inicializada - "+ propertiesInfo );
			System.setProperty("spring.devtools.restart.enabled", "false");
		};
	}
    */
	
	
	
	
}
