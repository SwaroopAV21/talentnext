package com.ecr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecr.entity.JTEntity;

@RestController
@Scope("request")
public class RibbionController {
    
    @Autowired
    private RestTemplate rt;

    @GetMapping("/get-product/{id}")
    public JTEntity getproductbyId(@PathVariable("id") int id){
        JTEntity jte=rt.getForObject("http://application/dev/js/show/"+id,JTEntity.class); //http://product-service/js/show/{id}
        return jte;
    }
}
