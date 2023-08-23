package com.js.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.js.service.JsService;
import com.js.entity.JEntity;

@RestController
@RequestMapping("/js")
@Scope("request")
public class JsController {
    
    @Autowired
    JsService js;

    @GetMapping(value="/showall",produces ="application/json" )
    public List<JEntity> showall(){
        return js.showall();
    }
    @GetMapping(value="/show/{id}",produces = "application/json")
    public Optional<JEntity> showbyid(@PathVariable int id){
        return showbyid(id);
    }

}
