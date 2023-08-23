package com.js.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.js.entity.JEntity;
import com.js.repo.JsRepo;

@Service
public class JsService {
    
    @Autowired
    JsRepo jr;

    public List<JEntity> showall(){
        return jr.findAll();
    }
    public Optional<JEntity> showbyid(int id){
        return jr.findById(id);
    }
}
