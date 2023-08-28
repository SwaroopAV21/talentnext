package com.fr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fr.entity.REntity;
import com.fr.service.Rservice;
import org.slf4j.Logger;
import org.slf4j.Logger.Factory;


@RestController
@Scope("request")
public class RibbonController {
     @Autowired
    private Rservice sr;

    private Logger log=logger.LoggerFactory.getLogger(RibbonController.class);

    @GetMapping("/get-product/{id}")
    public REntity getproductbyId(@PathVariable("id") int id){
        log.debug("Get productID "+id);
        return sr.getproductbyId(id);
    }
}
