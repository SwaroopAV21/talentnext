package com.rfj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RibbonReselence4jMPApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonReselence4jMPApplication.class, args);
	}
//prometheus tracks the time taken to execute 
	//Timed Ascpect is from aop, and MeterRegistry is from micrometer
	@Bean
	public TimedAspect timedaspect(MeterRegistry mr){
		return new TimedAspect(mr);
	}
//if we want to run in the docker and scraping  , we can configure a yml file ie prometheus.yml and run this yml file in docker
}
