package com.js.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.js.entity.JEntity;

@Repository
public interface JsRepo extends JpaRepository<JEntity,Integer> {   
}
