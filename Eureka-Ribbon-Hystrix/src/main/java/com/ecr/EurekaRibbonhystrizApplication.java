package com.ecr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;


@EnableCircuitBreaker
@SpringBootApplication
public class EurekaRibbonHystrizApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRibbonHystrizApplication.class, args);
	}

}
