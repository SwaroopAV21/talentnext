package com.js;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.js.entity.JEntity;
import com.js.repo.JsRepo;

@SpringBootApplication
public class JavaMicroServicesApplication implements CommandLineRunner{

	@Autowired
    @Qualifier(value="jsRepo")
    private JsRepo jr;

	public static void main(String[] args) {
		SpringApplication.run(JavaMicroServicesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		jr.save(new JEntity(null,"Tv",25000));
		jr.save(new JEntity(null,"Mouse",2500));
		jr.save(new JEntity(null,"Monitor",50000));
	}

}
