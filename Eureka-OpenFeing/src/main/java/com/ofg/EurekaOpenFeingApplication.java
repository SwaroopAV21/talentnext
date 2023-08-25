package com.ofg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication
public class EurekaOpenFeingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaOpenFeingApplication.class, args);
	}

}
