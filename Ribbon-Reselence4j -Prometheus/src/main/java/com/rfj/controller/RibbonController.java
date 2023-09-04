package com.rfj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rfj.entity.REntity;
import com.rfj.service.Rservice;

import io.micrometer.core.annotation.Timed;

@RestController
@Scope("request")
public class RibbonController {
     @Autowired
    private Rservice sr;

    //add this for micrometer prometheus
    //here we can get the time
    @Timed(value="getproductbyId.time", description="Time taken")
    @GetMapping("/get-product/{id}")
    public REntity getproductbyId(@PathVariable("id") int id){
        return sr.getproductbyId(id);
    }
}
