package com.rfj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rfj.entity.REntity;
import com.rfj.service.Rservice;

@RestController
@Scope("request")
public class RibbonController {
     @Autowired
    private Rservice sr;

    private Logger log=LoggerFactory.getLogger(RibbonController.class);

    @GetMapping("/get-product/{id}")
    public REntity getproductbyId(@PathVariable("id") int id){
        log.debug("Get productID "+id);
        REntity reent= sr.getproductbyId(id);
         log.debug("Get productID "+reent);
         return reent;
    }
}
