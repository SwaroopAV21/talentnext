package com.ofg.EurekaOpenFeingHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class EurekaOpenFeingHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaOpenFeingHystrixApplication.class, args);
	}

}

//annotations these are required for Exeption handling and the spring boot version should be under 2.4.10.and the dependency 
// 			<dependency>
// 				<groupId>org.springframework.cloud</groupId>
// 				<artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
// 			</dependency>
//@EnableFeignClients
//@EnableCircuitBreaker
//@EnableHystrixDashboard