package com.js.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.js.service.JsService;
import com.js.entity.JEntity;

@RestController
@RequestMapping("/js")
@Scope(value="request")
public class JsController {
    
    @Autowired
    @Qualifier(value="jsservice")
    private JsService js;

    
    @PostMapping(value="/add",consumes="application/json")@ResponseStatus(code=HttpStatus.CREATED)
    public JEntity addingaproduct(@RequestBody JEntity je){ 
        return js.addaprod(je); 
    }

    @GetMapping(value="/showall",produces ="application/json" )
    public List<JEntity> showall(){
        return js.showall();
    }
    @GetMapping(value="/show/{id}",produces = "application/json")
    public Optional<JEntity> showbyid(@PathVariable("id") int id){
        return showbyid(id);
    }

}
