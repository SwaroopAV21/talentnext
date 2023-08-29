package com.agy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class JmApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(JmApiGatewayApplication.class, args);
	}

}
//we have to add this api gateway to storeapp