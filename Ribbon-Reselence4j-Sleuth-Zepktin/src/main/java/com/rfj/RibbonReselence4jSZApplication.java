package com.rfj;

//import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RibbonReselence4jSZApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonReselence4jSZApplication.class, args);
	}
	//we have to add for zipkin
	// @Bean
	// public Sampler getSampler(){
	// 	//return Sampler.create(0.5f)
	// 	return Sampler.ALWAYS_SAMPLE;
	// }
//Apply to javamicroservices the main app

}
