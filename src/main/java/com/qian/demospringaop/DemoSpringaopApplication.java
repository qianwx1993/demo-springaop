package com.qian.demospringaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource()
public class DemoSpringaopApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringaopApplication.class, args);
	}

}
