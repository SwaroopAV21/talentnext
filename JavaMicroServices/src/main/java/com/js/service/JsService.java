package com.js.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.js.entity.JEntity;
import com.js.repo.JsRepo;

@Service(value="jsservice")
@Scope(value="singleton")
public class JsService {
    
    @Autowired
    @Qualifier(value="jsRepo")
    private JsRepo jr;

    public List<JEntity> showall(){
        return jr.findAll();
    }
    public Optional<JEntity> showbyid(int id){
        return jr.findById(id);
    }
    public JEntity addaprod(JEntity je){
        return jr.save(je);
    }
}
