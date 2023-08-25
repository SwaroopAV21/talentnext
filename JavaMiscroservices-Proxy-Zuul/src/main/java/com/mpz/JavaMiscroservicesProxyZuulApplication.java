package com.mpz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.mpz.filters.Errorfilter;
import com.mpz.filters.Postfilter;
import com.mpz.filters.Prefilter;
import com.mpz.filters.Routefilter;

@EnableZuulProxy
@SpringBootApplication
public class JavaMiscroservicesProxyZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMiscroservicesProxyZuulApplication.class, args);
	}
	@Bean
	public Prefilter getprefilter(){
		return new Prefilter();
	}
	@Bean
	public Postfilter getpostfilter(){
		return new Postfilter();
	}
	@Bean
	public Routefilter getroutefilter(){
		return new Routefilter();
	}
	@Bean
	public Errorfilter geterrorfilter(){
		return new Errorfilter();
	}
}
