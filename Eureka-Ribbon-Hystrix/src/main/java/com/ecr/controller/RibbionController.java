package com.ecr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import com.ecr.entity.JTEntity;
import com.ecr.service.ServiceRibbon;

@RestController
@Scope("request")
public class RibbionController {
    
    @Autowired
    private ServiceRibbon sr;

    @GetMapping("/get-product/{id}")
    public JTEntity getproductbyId(@PathVariable("id") int id){
        return sr.getproductbyId(id);
    }
}
