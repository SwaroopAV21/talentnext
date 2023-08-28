package com.fr;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignResilienceSZApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignResilienceApplication.class, args);
	}

	@Bean
	public Sampler getSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
}
//@FeignClient(name="",falback="") in service class/interface , no change in others
//@EnableFeignClient and @EnableCircuitBreaker