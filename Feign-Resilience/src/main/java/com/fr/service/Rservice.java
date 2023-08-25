package com.fr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fr.entity.REntity;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class Rservice {
     @Autowired
    private RestTemplate rt;

    //in the name="service_id"
    @CircuitBreaker(name="application",fallbackMethod = "fallbackgetprodbyid")
    public REntity getproductbyId(int id){
        REntity jte=rt.getForObject("http://application/dev/js/show/"+id,REntity.class); //http://product-service/js/show/{id}
        return jte;
    }

    public REntity fallbackgetprodbyid(int id,Throwable cause){
        //any business logic
        System.out.println("Exception"+cause.getMessage());
        return new REntity(id,"Monitor",5566);
    }
}
//in the fallback method we wil give a class file instead of method.
//throwable is optional in feign because we will be giving a class file 
//for eg (name="",fallback=Serviceproxy.class)